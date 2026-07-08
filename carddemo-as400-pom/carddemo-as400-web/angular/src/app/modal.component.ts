import { Component,  Input, HostListener, inject } from '@angular/core';
import { NgModule } from '@angular/core';
import { ModalService, MODALSERVICE } from './modal.service';
import { Subscription } from 'rxjs';
import { WindowComponents, BackendMessage } from './term/message';
import { AbstTermComponent } from './abs-term.component';
import { TransactionService } from './term/transaction.service';
import { ActivatedRoute } from '@angular/router';
import { TermService } from './term/term.service';
import { TestingService } from './term/testing.service';
import { CommonsModule } from './commons.module';
import { AppService } from './app.service';
import { ConfigService } from './config-service';
import { LanguageService } from './language/language-service';
import { MapRegistryService } from './services/map-registry.service';
import { TermComponent } from './term.component';
import { HelpService } from './help.service';
import {TermState} from './models/term-state.model';
import {MessageService} from 'primeng/api';
import {MessageLineService} from './services/message-line.service';
import { AidpService } from './aidp-service';
import * as bootstrap from 'bootstrap';

function isDefinedAndDifferentOf(value: string, notExpected: string) {
	return value && (value !== notExpected);
}

function isDefinedAndEqualOf(value: string, notExpected: string) {
	return value && (value === notExpected);
}

const KEY_ESC = 27;
/** Constante to retrieve instead */
// lrg height css
const baseHeight = 1.4;

@Component({
    selector: 'modal-window',
    standalone: false,
    template: `
    <div [id]="name" class="modal" tabindex="-1" role="dialog" style="overflow: hidden!important">
        <div [ngClass]="modalClass()" style="position: absolute">
            <div class="modal-content" [ngStyle]="positionStyle()" >                
                <div>
                    <div *ngIf="hasBorderTop()" [id]="name + '-border-top'" [ngClass]="computeBorderClasses()" [ngStyle]="titleTopStyle()">
	                    <div [ngClass]="computeTitleClasses()" [ngStyle]="titleTopColorStyle()">
	                    {{titleTop}}
	                    </div>
                    </div> 
                        <div #dynamicTarget></div>
                    <div *ngIf="hasBorderBottom()" [id]="name + '-border-bottom'" [ngClass]="computeBorderClasses()" [ngStyle]="titleBottomPositionStyle()">
                   	    <div [ngStyle]="titleBottomStyle()">
		                    <div [ngClass]="computeTitleClasses()" [ngStyle]="titleBottomColorStyle()">
	                    	{{titleBottom}}
		                    </div>
		                </div>
                    </div> 
                </div> 
            </div>
        </div>
    </div>
        `,
        providers: [TermState, MessageLineService]
})

/** Component Modal */
export class ModalComponent extends AbstTermComponent {
    
    // DIs
    private mapRegistryService: MapRegistryService = inject(MapRegistryService);

    constructor(
        modalService: ModalService,
        transactionService: TransactionService,
        languageService: LanguageService,
        service: TermService,
        appService: AppService,
        testingService: TestingService,
        configService: ConfigService,
        helpService: HelpService,
        messageLineService: MessageLineService,
        aidpService: AidpService
    ) {
        super(modalService, transactionService, languageService, service, appService, testingService, configService, helpService, messageLineService, aidpService);
        this.termState.initializeModalProperties();
    }

    @Input() name: string;
    numberDivs : Array<any>;

    // Position : upper-left corner

    /** Color border */
    public borderColor: string;

    /** Intensity border */
    public borderIntensity: string;

    /** Hilight border */
    public borderHilight: string;

    /** Dashed border */
    public borderDashed: boolean;

    /** border */
    public border : boolean;

    /** Title */
	public titleTop: string;	
	public titleBottom: string;
	public titleColorTop: string;
	public titleColorBottom: string;	
	public titleAlignTop: string;
	public titleAlignBottom: string;
	public borderTop: string;
	public borderBottom: string;

    private subscription: Subscription;

    async getMapComponent(mapName: string): Promise<any> {
        let mapComponent = this.mapRegistryService.fetchSubComponent(mapName);
        if (mapComponent) {
            return mapComponent;
        }
        // Map component not found
        // Try to load the module again and try again.
        await this.loadModule(this.mapRegistryService.getModuleNameByComponent(mapName));
        return this.mapRegistryService.fetchSubComponent(mapName);
    }

    getIdAnchor() : HTMLElement {
        return this.childrenLevel(document.getElementById(this.name), 2)[0];
    }

    protected haveToChangeTargetAccessibility(): boolean {
        return true;
    }

    isModal(): boolean {
        this.termState.isModal = true;
        return true;
    }

    getName(): String {
        return this.name;
    }

    postAction() {
         this._hideDialog();
    }
    
    public async onReceivedMessage(backendMessage: BackendMessage) {
        // Transfer to main component receiver
        this.getParent().onReceivedMessage(backendMessage);
    }

    private _defaults = {
        title: 'Confirmation',
        message: 'Do you want to cancel your changes?',
        cancelText: 'Cancel',
        okText: 'Yes'
    };

    activate(): Promise<boolean> {
        console.log('Displays modal ' + this.name );
        let promise = new Promise<boolean>(resolve => {
            this._show(resolve);
        });

        return promise;
    }

    private _show(resolve: (boolean) => any) {
        document.onkeyup = null;
        setTimeout(() => {            
            const modalEl = document.getElementById(this.name);
            if (!modalEl){
                return;
            }
            const modal = new bootstrap.Modal(modalEl);
            document.getElementsByClassName("modal-backdrop")[0]?.remove();
            modal.show();        
        }, 50);
        this.modalService.pushModal(this.name);
        document.onkeyup = (e: any) => {
            if (e.which == KEY_ESC) {
                this._hideDialog();
                return resolve(false);
            }
        };
    }

    private _hideDialog() {
        const modalEl = document.getElementById(this.name);
        const modal = bootstrap.Modal.getInstance(modalEl);
        modal?.hide();
        this.modalService.popModal(this.name);
        document.body.classList.remove('modal-open');
        if (document.getElementsByTagName('modal-window') == null){
            document.querySelectorAll('.modal-backdrop').forEach(el => el.remove());
        }
    }

    ngOnInit(): any {
        this.termState.name = this.name;
        this.subscription = this.modalService.activeModal(this.name).subscribe( ({message, parentComponent}) => {
            this.activate();
            this.setParent(parentComponent);
            this.processLogicalMessage(message);
            this.mapWindowAttributes(message as WindowComponents);
        });
    }


    override ngAfterViewInit(): void {
        super.ngAfterViewInit();
        const observer = new MutationObserver((mutations, obs) => {
            const modal = document.getElementById(this.name);
            if (modal && getComputedStyle(modal).display !== 'none') {
                this.modalService.modalReadyEvent.emit(this.name);
                obs.disconnect(); // Stop observing once the modal is found
            }
        });
        observer.observe(document.body, {
            childList: true, // Listen for added or removed elements
            subtree: true // Look for changes in descendants also
        });
    }

    ngOnDestroy(): void {
        this._hideDialog();
        if (this.subscription) {
            this.subscription.unsubscribe();
        }
    }

    private mapWindowAttributes(message: WindowComponents) {
        if(message.maps === undefined){
            return;
        }
        message.maps.forEach(windowMap => {
            if(windowMap.component == "end-message"){
                this.borderColor = "#C00000";
                this.termState.modalProperties.positionLeft = this.modalService.getDefaultPosLeft();
                this.termState.modalProperties.positionTop = this.modalService.getDefaultPosTop();
                this.termState.modalProperties.height = this.modalService.getDefaultHeight();
                this.termState.modalProperties.width = this.modalService.getDefaultWidth();
                this.termState.modalProperties.cursorPosition = false;
            } else {
                if (windowMap.borderColor) {
                    this.borderColor = windowMap.borderColor;
                }

                if (windowMap.borderIntensity) {
                    this.borderIntensity = windowMap.borderIntensity;
                }

                if (windowMap.borderHilight) {
                    this.borderHilight = windowMap.borderHilight;
                }

                if (windowMap.borderDashed) {
                    this.borderDashed = windowMap.borderDashed;
                }

                if (windowMap.border) {
                    this.border = windowMap.border;
                }

                if (windowMap.positionLeft) {
                    this.termState.modalProperties.positionLeft = windowMap.positionLeft;
                }

                if (windowMap.positionTop) {
                    this.termState.modalProperties.positionTop = windowMap.positionTop;
                }

                if (windowMap.height) {
                    this.termState.modalProperties.height = windowMap.height;
                }

                if (windowMap.width) {
                    this.termState.modalProperties.width = windowMap.width + 2;
                }

                if (windowMap.cursorPosition) {
                    this.termState.modalProperties.cursorPosition = windowMap.cursorPosition;
                }
                
                if (windowMap.titleTop) {
                    this.titleTop = windowMap.titleTop;
                }

                if (windowMap.titleBottom) {
                    this.titleBottom = windowMap.titleBottom;
                }
                
                if (windowMap.titleColorTop) {
                    this.titleColorTop = windowMap.titleColorTop;
                }
 
                 if (windowMap.titleColorBottom) {
                    this.titleColorBottom = windowMap.titleColorBottom;
                }

                if (windowMap.titleAlignTop) {
                    this.titleAlignTop = windowMap.titleAlignTop;
                }
                
                if (windowMap.titleAlignBottom) {
                    this.titleAlignBottom = windowMap.titleAlignBottom;
                }               
 
                if (windowMap.borderTop) {
                    this.borderTop = windowMap.borderTop;
                } 
                
                if (windowMap.borderBottom) {
                    this.borderBottom = windowMap.borderBottom;
                }
                
                if(windowMap.windowRef == null){
                	// Update the messageLine attr only for the main modal component
                    if (windowMap.messageLine != undefined) {
                        this.termState.modalProperties.messageLine = windowMap.messageLine;
                    }
                }
                
                if (windowMap.dspMode !== undefined) {
                    let numDivs = windowMap.dspMode === "*DS3" ? 24 : 27;
                    this.numberDivs = new Array(numDivs);
                }
            }
        });
    }

    /** complete style with a separator if style is not empty */
    addTextToStyle(style:string, text:string):string {
        if (style.length > 1) {
            style += ',';
        }
        style += text;
        return style;

    }

    modalClass(){
        let text = "modal-dialog";
        if(this.isScreenExtended()){
            text += " A7";
        }
        return text;
    }

    /**  Set position as upper-left corner */
    positionStyle() {
        // Screen width
        let sizePanel = this.isScreenExtended() ? 132 : 80;
        // Line Height
        let lineHeigth = 1.25;
        // Empiric value to increase a little bit no border windows heigth
		let noBorderShift = 0.15;

        let style = "{";

        if (this.termState.modalProperties.positionLeft && this.termState.modalProperties.positionTop) {
            let newLeftPosition = (100*this.termState.modalProperties.positionLeft)/sizePanel;
            style += '"left": "' + newLeftPosition + '%"';

            if(this.hasBorderTop()){
                style += ',"top": "' + (this.termState.modalProperties.positionTop * lineHeigth - baseHeight) + 'em"';
            } else {
                style += ',"top": "' + this.termState.modalProperties.positionTop * lineHeigth + 'em"';
            }
        }

        if (this.termState.modalProperties.width && this.termState.modalProperties.height) {
            let width = (100*this.termState.modalProperties.width)/sizePanel;
            style = this.addTextToStyle(style, '"width":"'+ width + '%"');

            let height = (this.termState.modalProperties.height *  baseHeight);
            if (this.border) {
                height += 2*baseHeight;
                style += ',"border-top": "none"';
            } else {
                if (this.hasBorderTop() ) {
                    height += baseHeight;
                } else{
                    height += noBorderShift;
                }
                if (this.hasBorderBottom()) {
                    height += baseHeight;
                } else{
                    height += noBorderShift;
                }
            }
       
            style += ',"height":"'+ height + 'em"'; 
        }

        if (this.borderColor) {
			// Set the border color
			if ((this.hasBorderTop() || this.hasBorderBottom()) && !isDefinedAndEqualOf(this.borderHilight, 'REVERSE')) {
				style += ',"border-color": "var(--system-background)"';
			} else {
            	style += ',"border-color": "var(--' + this.borderColor.toLowerCase() + ')"';
			}
        }
        
        if (this.borderDashed) {
            style += ',"border": "3px dashed white"';
        }
        
        // In the case where the style string is something like:
        // {, border-color: yellow;}
        // we need to remove the leading comma
        style = style.replace("{,", "{");
        
        style += "}";

        return JSON.parse(style);
    }

    hasBorderTop(): boolean {
        if (this.border) {
            return true;
        } else {
            // title is defined
            if (this.titleTop) {
                return true;
            } else {
                if (this.borderTop) {
                    return true;
                }
            }
        }
        return false;
    }

    hasBorderBottom() {
        if (this.border) {
            return true;
        } else {
            // title is defined
            if (this.titleBottom) {
                return true;
            } else {
                if (this.borderBottom) {
                    return true;
                }
            }
        }
        return false;
    }

    /**  Class of the border */
	computeBorderClasses(): string[] {
		
		// Determinate classes
		let classes = [];
		if (isDefinedAndEqualOf(this.borderHilight, 'REVERSE')) {
        	classes.push(this.borderColor.toLowerCase());
        }
		if (isDefinedAndDifferentOf(this.borderIntensity, 'NORM')) {
			classes.push(this.borderIntensity.toLowerCase());
		}
		if (isDefinedAndDifferentOf(this.borderHilight, 'OFF')) {
			classes.push(this.borderHilight.toLowerCase());
		}

		return classes;
	}

    /**  Class of the title in the top or bottom of the border */
	computeTitleClasses(): string[] {
		
		// Determinate classes
		let classes = [];
		if (this.borderColor) {
			classes.push(this.borderColor.toLowerCase());
        }
		if (isDefinedAndDifferentOf(this.borderIntensity, 'NORM')) {
			classes.push(this.borderIntensity.toLowerCase());
		}
        if (!isDefinedAndEqualOf(this.borderHilight, 'REVERSE')) {
            classes.push('reverse');
        }
		if (isDefinedAndDifferentOf(this.borderHilight, 'OFF') && isDefinedAndDifferentOf(this.borderHilight, 'REVERSE')) {
            classes.push(this.borderHilight.toLowerCase());
		}

		return classes;
	}

    /**  Style of the title in the top of the border */
    titleTopStyle() {
        let style = "{";
        style += '"display": "flex",';
        style += '"width": "100%",';
        style += '"height": "' + baseHeight + 'em"';
        
        if (this.titleAlignTop) {
            style += ',"justify-content": "' + this.titleAlignTop + '"';
        } else {
            style += ',"justify-content": "center"'; 
        }
        style += "}";
        return JSON.parse(style);
    }

    /**  Style and position of the title in the bottom of the border */
    titleBottomPositionStyle() {        
        let style = "{";
        style += '"position": "absolute",';
        style += '"width": "100%",';
        style += '"height": "' + baseHeight + 'em"';

        let height = (this.termState.modalProperties.height *  baseHeight);
        if (this.border || this.hasBorderBottom()) {
            height += baseHeight;
        }
        style += ',"top": "' + height + 'em"';

        style += "}";
        return JSON.parse(style);
    }

    /**  Style of the title in the bottom of the border */
    titleBottomStyle() {
        let style = "{";
        style += '"display": "flex",';
        style += '"width": "100%",';
        style += '"height": "' + baseHeight + 'em"';
        
        if (this.titleAlignBottom) {
            style += ',"justify-content": "' + this.titleAlignBottom + '"';
        } else {
            style += ',"justify-content": "center"'; 
        }
        style += "}";
        return JSON.parse(style);
    }

    /**  Style of the title in the top of the border */
    titleTopColorStyle() {
        let style = new Array ();

        if (isDefinedAndEqualOf(this.borderHilight, 'REVERSE')) {
            style.push('"background-color": "var(--system-background)"');
        }
        if (this.titleColorTop) {
            style.push('"color": "' + this.titleColorTop + '"');
        }

        let styleJson = "{" + style.join(",") + "}"
        return JSON.parse(styleJson);
    }

    /**  Style of the title in the bottom of the border */
    titleBottomColorStyle() {
        let style = "{";
        if (isDefinedAndEqualOf(this.borderHilight, 'REVERSE')) {
			style += '"background-color": "var(--system-background)"';
		}
        if (this.titleColorBottom) {
            style += ',"color": "' + this.titleColorBottom + '"';
        }
        style += "}";
        return JSON.parse(style);
    }
    
    /* Check if current modal component is the Additional Message screen */
    private isAdditionalMessageComponent(): boolean {
        return this.name == 'additional-message';
    }

    /* Check if current modal component is the Help pop-up */
    private isHelpComponent(): boolean {
        return this.name == 'help-modal';
    }

    /** ----------------------------------------------------------------------------------------  **/
    /** React to attention keys (only for additional message screen) */
    @HostListener('document:keydown', ['$event'])
    onKeyDownListener(e: KeyboardEvent) {
    	// If the current component is not the one on the top, stop listening
        if(!this.isAdditionalMessageComponent() && !this.isHelpComponent()){
            super.onKeyDownListener(e);
            return;
        }
        
        let attentionKey: string = null;

        // Some key functions can be used on additional message screen (not implemented)
    	let keyToCheck = '';
        let key = e.key || '';
        let keyCode = e.which || e.keyCode || -1;
        let groups = [];
        if (keyCode == 13 || key === 'Enter') {
            attentionKey = 'ENTER';
	    	keyToCheck = attentionKey;
        }  else if (this.transactionService.is5250() && (keyCode == 33 || key === 'PageUp')) {
            if(!this.pagingSFL(e)){
                attentionKey = 'PAGEUP';
		    	keyToCheck = attentionKey;
            }
        }  else if (this.transactionService.is5250() && (keyCode == 34 || key === 'PageDown')) {
            if(!this.pagingSFL(e)){
                attentionKey = 'PAGEDOWN';
		    	keyToCheck = attentionKey;
            }
        } else if ((keyCode == 112 && e.ctrlKey) || (keyCode == 45 && e.altKey)) {
            // Ctrl + F1 or Alt + Insert for PA1 (V7-4104)
            attentionKey = 'PA1';
        } else if ((keyCode == 113 && e.ctrlKey) || (keyCode == 36 && e.altKey)) {
            // Ctrl + F2 or Alt + Home for PA2 (V7-4104)
            attentionKey = 'PA2';
        } else if ((keyCode == 114 && e.ctrlKey) || (keyCode == 33 && e.shiftKey)) {
            // Ctrl + F3 or Shift + PageUp for PA3 (V7-4104)
            attentionKey = 'PA3';
        } else if (keyCode >= 112 && keyCode <= 123) {
            let pfk = (keyCode - 111);
            if (e.shiftKey) {
                // Shift + Fx for PF13 to PF24 (V7-2657)
                pfk += 12;
            }
            keyToCheck = pfk < 10 ? "0"+pfk : String(pfk);
            attentionKey = 'PF' + pfk;
        } else if (groups = key.match(/^F(\d+)$/)) {
            attentionKey = 'PF' + groups[1];
        } else if (keyCode == 19) {
            // "Pause" key on a PC keyboard
            attentionKey = 'CLEAR';
        }

        if (attentionKey !== null) {
            console.log('Attention key pressed (' + attentionKey + ')');
            e.stopImmediatePropagation();
            e.preventDefault();
            
            let isActionKey = this.checkActionKey(keyToCheck);
            let isFunctionKey = this.checkFunctionKey(keyToCheck);
            if(!(isActionKey || isFunctionKey)){
                return;
            }
            
            if (attentionKey == 'PF2' && this.isHelpComponent()) {
                if (this.getParent() instanceof TermComponent) {
                    this.getParent().restoreDisplayMode();
                    this.getParent().destroyAllModalComponents();
                    this.getParent().diplayGeneralHelpScreen();
                } else {
                    console.log("Unable to display general help screen, the parent screen is not of a type termComponent, parent name: " + this.getParent().getName());
                }
                return;
            }            
            
            if ((attentionKey == 'PF12' || attentionKey == 'ENTER') && this.isHelpComponent()) {
                // move the cursor/focus back to the input field it was at prior to the help dialog
                setTimeout(() => {
                    this.fieldSyncService.getFieldToReturnFocusTo()?.focus();
                }, 0);
            }
 
            this.getParent().restoreDisplayMode();
            this.getParent().destroyTopModalComponent();

        }
    }
}

@NgModule({
    imports: [
        CommonsModule
    ],
    declarations: [ModalComponent],
    providers: [MODALSERVICE],
    exports: [ModalComponent]
})
export class ModalModule {

}
