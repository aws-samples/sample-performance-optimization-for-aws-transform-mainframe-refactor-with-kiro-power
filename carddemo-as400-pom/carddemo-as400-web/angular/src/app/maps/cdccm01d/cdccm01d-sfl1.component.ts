import { Component, Input, AfterContentChecked} from '@angular/core';
import { Overlay } from "./../commonMap/overlay";

@Component({
    selector: 'cdccm01d-sfl1',
    standalone: false,
    templateUrl: './cdccm01d-sfl1.component.html'
})
export class Cdccm01dSfl1Component extends Overlay implements AfterContentChecked {
    @Input() sfl1: any;
    @Input() index: number;
    @Input() colid: number = 0;

    option: any = {};
    cardnum: any = {};
    custid: any = {};
    acctnum: any = {};
    primarysec: any = {};
    status: any = {};

    public FIELDS: string[] = ['option', 'cardnum', 'custid', 'acctnum', 'primarysec', 'status'];

    ngAfterContentChecked(): void {
        this.option = this.sfl1.option;
        this.cardnum = this.sfl1.cardnum;
        this.custid = this.sfl1.custid;
        this.acctnum = this.sfl1.acctnum;
        this.primarysec = this.sfl1.primarysec;
        this.status = this.sfl1.status;
    }

    positionSFL(): String {
    	return "lgr_col";
    }

    ngAfterViewInit(): void {
        this.option.authorizedValues = ['2', '4', '5', '7', '9'];
        this.option.allowAllBlank = true;
        this.cardnum.numerical = 'NUM_STD';
    }

    getSFLFocus(): boolean {
        if (this.index === 0) {
            return true;
        }
        return false;
    }
}
