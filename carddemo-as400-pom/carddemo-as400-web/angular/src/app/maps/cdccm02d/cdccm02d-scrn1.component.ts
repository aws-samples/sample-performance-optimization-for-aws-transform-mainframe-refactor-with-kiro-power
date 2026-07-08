import { Component } from '@angular/core';
import { Overlay } from "./../commonMap/overlay";

@Component({
    selector: 'cdccm02d-scrn1',
    standalone: false,
    templateUrl: './cdccm02d-scrn1.component.html'
})
export class Cdccm02dScrn1Component extends Overlay {
    csrrec: any = {};
    csrfld: any = {};
    csrpos: any = {};
    labelViewCreditCard: any = {'value': 'View Credit Card'};
    labelCreateCreditCard: any = {'value': 'Create Credit Card'};
    labelUpdateCreditCard: any = {'value': 'Update Credit Card'};
    date1: any = {};
    time1: any = {};
    labelUser: any = {};
    pgmname: any = {};
    cardnum: any = {};
    custid: any = {};
    acctnum: any = {};
    name: any = {};
    primarysec: any = {};
    status: any = {};
    statusdess: any = {};
    expirymo: any = {};
    expiryyr: any = {};
    cvv: any = {};
    labelCreatedBy: any = {'value': 'Created By:'};
    ccmcrtusr: any = {};
    labelOn: any = {'value': 'On:'};
    ccmcrtdt: any = {};
    ccmcrttm: any = {};
    labelProgram: any = {'value': 'Program:'};
    ccmcrtpgm: any = {};
    labelUpdatedBy: any = {'value': 'Updated By:'};
    ccmchgusr: any = {};
    labelOn1: any = {'value': 'On:'};
    ccmchgdt: any = {};
    ccmchgtm: any = {};
    labelProgram1: any = {'value': 'Program:'};
    ccmchgpgm: any = {};
    labelF3ExitF9CardHistory: any = {'value': 'F3=Exit  F9=Card History'};
    labelF12Cancel: any = {'value': 'F12=Cancel'};
    labelF2Clear: any = {'value': 'F2=Clear'};
    labelF3ExitF12Cancel: any = {'value': 'F3=Exit  F12=Cancel'};
    labelF3ExitF9CardHistory1: any = {'value': 'F3=Exit  F9=Card History'};
    labelF12Cancel1: any = {'value': 'F12=Cancel'};

    public FIELDS: string[] = ['csrrec', 'csrfld', 'csrpos', 'labelViewCreditCard', 'labelCreateCreditCard', 'labelUpdateCreditCard', 'date1', 'time1', 'labelUser', 'pgmname', 'cardnum', 'custid', 'acctnum', 'name', 'primarysec', 'status', 'statusdess', 'expirymo', 'expiryyr', 'cvv', 'labelCreatedBy', 'ccmcrtusr', 'labelOn', 'ccmcrtdt', 'ccmcrttm', 'labelProgram', 'ccmcrtpgm', 'labelUpdatedBy', 'ccmchgusr', 'labelOn1', 'ccmchgdt', 'ccmchgtm', 'labelProgram1', 'ccmchgpgm', 'labelF3ExitF9CardHistory', 'labelF12Cancel', 'labelF2Clear', 'labelF3ExitF12Cancel', 'labelF3ExitF9CardHistory1', 'labelF12Cancel1'];
    public LINES: number[] = [1, 2, 5, 6, 7, 9, 10, 12, 14, 15, 18, 19, 22];

    ngAfterViewInit(): void {
        this.csrpos.numerical = 'NUM_SIGNED';
        this.cardnum.numerical = 'NUM_STD';
        this.ccmcrtdt.numerical = 'NUM_STD';
        this.ccmcrttm.numerical = 'NUM_STD';
        this.ccmchgdt.numerical = 'NUM_STD';
        this.ccmchgtm.numerical = 'NUM_STD';
    }
}
