import { Component, Input, AfterContentChecked} from '@angular/core';
import { Overlay } from "./../commonMap/overlay";

@Component({
    selector: 'cdcus03d-sfl1',
    standalone: false,
    templateUrl: './cdcus03d-sfl1.component.html'
})
export class Cdcus03dSfl1Component extends Overlay implements AfterContentChecked {
    @Input() sfl1: any;
    @Input() index: number;
    @Input() colid: number = 0;

    option: any = {};
    custid: any = {};
    firstname: any = {};
    lastname: any = {};

    public FIELDS: string[] = ['option', 'custid', 'firstname', 'lastname'];

    ngAfterContentChecked(): void {
        this.option = this.sfl1.option;
        this.custid = this.sfl1.custid;
        this.firstname = this.sfl1.firstname;
        this.lastname = this.sfl1.lastname;
    }

    positionSFL(): String {
    	return "lgr_col";
    }

    ngAfterViewInit(): void {
        this.option.authorizedValues = ['X'];
        this.option.allowAllBlank = true;
    }

    getSFLFocus(): boolean {
        if (this.index === 0) {
            return true;
        }
        return false;
    }
}
