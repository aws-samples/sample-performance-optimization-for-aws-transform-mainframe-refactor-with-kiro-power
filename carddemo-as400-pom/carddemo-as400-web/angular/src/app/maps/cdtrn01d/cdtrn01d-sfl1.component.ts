import { Component, Input, AfterContentChecked} from '@angular/core';
import { Overlay } from "./../commonMap/overlay";

@Component({
    selector: 'cdtrn01d-sfl1',
    standalone: false,
    templateUrl: './cdtrn01d-sfl1.component.html'
})
export class Cdtrn01dSfl1Component extends Overlay implements AfterContentChecked {
    @Input() sfl1: any;
    @Input() index: number;
    @Input() colid: number = 0;

    d1soption: any = {};
    d1stranid: any = {};
    d1sdate: any = {};
    d1sdess: any = {};
    d1samount: any = {};
    d1sstatus: any = {};

    public FIELDS: string[] = ['d1soption', 'd1stranid', 'd1sdate', 'd1sdess', 'd1samount', 'd1sstatus'];

    ngAfterContentChecked(): void {
        this.d1soption = this.sfl1.d1soption;
        this.d1stranid = this.sfl1.d1stranid;
        this.d1sdate = this.sfl1.d1sdate;
        this.d1sdess = this.sfl1.d1sdess;
        this.d1samount = this.sfl1.d1samount;
        this.d1sstatus = this.sfl1.d1sstatus;
    }

    positionSFL(): String {
    	return "lgr_col";
    }

    ngAfterViewInit(): void {
        this.d1sdate.numerical = 'NUM_STD';
    }

    getSFLFocus(): boolean {
        if (this.index === 0) {
            return true;
        }
        return false;
    }
}
