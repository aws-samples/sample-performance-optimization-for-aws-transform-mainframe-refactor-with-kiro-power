import { Component } from '@angular/core';
import { Overlay } from "./../commonMap/overlay";

@Component({
    selector: 'cdact02d-scrn1',
    standalone: false,
    templateUrl: './cdact02d-scrn1.component.html'
})
export class Cdact02dScrn1Component extends Overlay {
    csrrec: any = {};
    csrfld: any = {};
    csrpos: any = {};
    labelEditAccount: any = {'value': 'Edit Account'};
    labelAddAccount: any = {'value': 'Add Account'};
    labelViewAccount: any = {'value': 'View Account'};
    date1: any = {};
    time1: any = {};
    labelUser: any = {};
    pgmname: any = {};
    acctnum: any = {};
    opendate: any = {};
    expirydate: any = {};
    pricustid: any = {};
    seccustid: any = {};
    acctgrp: any = {};
    credlimit: any = {};
    cashlimit: any = {};
    labelCurrentBalance: any = {'value': 'Current Balance       :'};
    balance: any = {};
    labelCurrentCycleCredit: any = {'value': 'Current Cycle Credit  :'};
    curcredit: any = {};
    labelCurrentCycleDebit: any = {'value': 'Current Cycle Debit   :'};
    curdebit: any = {};
    labelCreatedBy: any = {'value': 'Created By:'};
    actcrtusr: any = {};
    labelOn: any = {'value': 'On:'};
    actcrtdt: any = {};
    actcrttm: any = {};
    labelProgram: any = {'value': 'Program:'};
    actcrtpgm: any = {};
    labelUpdatedBy: any = {'value': 'Updated By:'};
    actchgusr: any = {};
    labelOn1: any = {'value': 'On:'};
    actchgdt: any = {};
    actchgtm: any = {};
    labelProgram1: any = {'value': 'Program:'};
    actchgpgm: any = {};
    labelAccountStatus: any = {'value': 'Account Status :'};
    status: any = {};

    public FIELDS: string[] = ['csrrec', 'csrfld', 'csrpos', 'labelEditAccount', 'labelAddAccount', 'labelViewAccount', 'date1', 'time1', 'labelUser', 'pgmname', 'acctnum', 'opendate', 'expirydate', 'pricustid', 'seccustid', 'acctgrp', 'credlimit', 'cashlimit', 'labelCurrentBalance', 'balance', 'labelCurrentCycleCredit', 'curcredit', 'labelCurrentCycleDebit', 'curdebit', 'labelCreatedBy', 'actcrtusr', 'labelOn', 'actcrtdt', 'actcrttm', 'labelProgram', 'actcrtpgm', 'labelUpdatedBy', 'actchgusr', 'labelOn1', 'actchgdt', 'actchgtm', 'labelProgram1', 'actchgpgm', 'labelAccountStatus', 'status'];
    public LINES: number[] = [1, 2, 4, 5, 6, 8, 9, 10, 12, 13, 15, 16, 17, 19, 20, 22];

    ngAfterViewInit(): void {
        this.csrpos.numerical = 'NUM_SIGNED';
        this.actcrtdt.numerical = 'NUM_STD';
        this.actcrttm.numerical = 'NUM_STD';
        this.actchgdt.numerical = 'NUM_STD';
        this.actchgtm.numerical = 'NUM_STD';
    }
}
