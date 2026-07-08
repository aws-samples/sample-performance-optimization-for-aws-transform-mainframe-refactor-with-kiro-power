import { Component, Input, AfterContentChecked} from '@angular/core';
import { Overlay } from "./../commonMap/overlay";

@Component({
    selector: 'cdaut01d-sfl1',
    standalone: false,
    templateUrl: './cdaut01d-sfl1.component.html'
})
export class Cdaut01dSfl1Component extends Overlay implements AfterContentChecked {
    @Input() sfl1: any;
    @Input() index: number;
    @Input() colid: number = 0;

    authid: any = {'value': 'AUTHORIZATION ID'};
    trnid: any = {'value': 'TRANSACTION ID'};
    cardnum: any = {'value': 'CREDIT CARD NUMBER'};
    rspreason: any = {'value': 'AUTH RESP REASON'};
    fraudflag: any = {'value': 'FRAUD FLAG'};
    authdate: any = {'value': 'AUTH DATE'};
    authtime: any = {'value': 'AUTH TIME'};

    public FIELDS: string[] = ['authid', 'trnid', 'cardnum', 'rspreason', 'fraudflag', 'authdate', 'authtime'];

    ngAfterContentChecked(): void {
        this.authid = this.sfl1.authid;
        this.trnid = this.sfl1.trnid;
        this.cardnum = this.sfl1.cardnum;
        this.rspreason = this.sfl1.rspreason;
        this.fraudflag = this.sfl1.fraudflag;
        this.authdate = this.sfl1.authdate;
        this.authtime = this.sfl1.authtime;
    }

    positionSFL(): String {
    	return "lgr_col";
    }

    ngAfterViewInit(): void {
        this.authid.numerical = 'NUM_SIGNED';
        this.trnid.numerical = 'NUM_SIGNED';
        this.cardnum.numerical = 'NUM_STD';
    }

    getSFLFocus(): boolean {
        if (this.index === 0) {
            return true;
        }
        return false;
    }
}
