import { Component, Input, AfterContentChecked} from '@angular/core';
import { Overlay } from "./../commonMap/overlay";

@Component({
    selector: 'cdcca01d-sfl1',
    standalone: false,
    templateUrl: './cdcca01d-sfl1.component.html'
})
export class Cdcca01dSfl1Component extends Overlay implements AfterContentChecked {
    @Input() sfl1: any;
    @Input() index: number;
    @Input() colid: number = 0;

    activity: any = {'value': 'ACTIVITY'};
    dess: any = {'value': 'DESCRIPTION'};
    ccauser: any = {'value': 'CUS ADD USER'};
    ccatmstamp: any = {'value': 'CCA TIME STAMP'};

    public FIELDS: string[] = ['activity', 'dess', 'ccauser', 'ccatmstamp'];

    ngAfterContentChecked(): void {
        this.activity = this.sfl1.activity;
        this.dess = this.sfl1.dess;
        this.ccauser = this.sfl1.ccauser;
        this.ccatmstamp = this.sfl1.ccatmstamp;
    }

    positionSFL(): String {
    	return "lgr_col";
    }

    ngAfterViewInit(): void {
    }

    getSFLFocus(): boolean {
        if (this.index === 0) {
            return true;
        }
        return false;
    }
}
