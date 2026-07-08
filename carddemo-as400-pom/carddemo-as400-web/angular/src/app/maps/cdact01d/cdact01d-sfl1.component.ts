import { Component, Input, AfterContentChecked} from '@angular/core';
import { Overlay } from "./../commonMap/overlay";

@Component({
    selector: 'cdact01d-sfl1',
    standalone: false,
    templateUrl: './cdact01d-sfl1.component.html'
})
export class Cdact01dSfl1Component extends Overlay implements AfterContentChecked {
    @Input() sfl1: any;
    @Input() index: number;
    @Input() colid: number = 0;

    option: any = {};
    sflacct: any = {};
    opendate: any = {};
    sflpcust: any = {};
    sflscust: any = {};
    sflbal: any = {};
    sflsts: any = {};

    public FIELDS: string[] = ['option', 'sflacct', 'opendate', 'sflpcust', 'sflscust', 'sflbal', 'sflsts'];

    ngAfterContentChecked(): void {
        this.option = this.sfl1.option;
        this.sflacct = this.sfl1.sflacct;
        this.opendate = this.sfl1.opendate;
        this.sflpcust = this.sfl1.sflpcust;
        this.sflscust = this.sfl1.sflscust;
        this.sflbal = this.sfl1.sflbal;
        this.sflsts = this.sfl1.sflsts;
    }

    positionSFL(): String {
    	return "lgr_col";
    }

    ngAfterViewInit(): void {
        this.option.authorizedValues = ['2', '4', '5'];
        this.option.allowAllBlank = true;
    }

    getSFLFocus(): boolean {
        if (this.index === 0) {
            return true;
        }
        return false;
    }
}
