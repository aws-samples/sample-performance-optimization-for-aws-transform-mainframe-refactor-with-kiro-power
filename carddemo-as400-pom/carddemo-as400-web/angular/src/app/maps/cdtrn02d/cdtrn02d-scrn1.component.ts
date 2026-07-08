import { Component } from '@angular/core';
import { Overlay } from "./../commonMap/overlay";

@Component({
    selector: 'cdtrn02d-scrn1',
    standalone: false,
    templateUrl: './cdtrn02d-scrn1.component.html'
})
export class Cdtrn02dScrn1Component extends Overlay {
    csrrec: any = {};
    csrfld: any = {};
    csrpos: any = {};
    labelViewTransactions: any = {'value': 'View Transactions'};
    labelSubmitTransaction: any = {'value': 'Submit Transaction'};
    date1: any = {};
    time1: any = {};
    labelUser: any = {};
    pgmname: any = {};
    ftrtext: any = {};
    trnid: any = {};
    labelStatus: any = {'value': 'Status :'};
    status: any = {};
    statusdtl: any = {};
    cardnum: any = {};
    typecd: any = {};
    categcd: any = {};
    source: any = {};
    dess: any = {};
    amountedt: any = {};
    amountdsp: any = {};
    merchid: any = {};
    merchname: any = {};
    origdate: any = {};
    procdate: any = {};
    labelSubmittedBy: any = {'value': 'Submitted By :'};
    usra1: any = {};
    labelOn: any = {'value': 'On:'};
    dtea1: any = {};
    tmea1: any = {};
    labelProgram: any = {'value': 'Program:'};
    pgma1: any = {};
    labelAuthorizedBy: any = {'value': 'Authorized By:'};
    usra2: any = {};
    labelOn1: any = {'value': 'On:'};
    dtea2: any = {};
    tmea2: any = {};
    labelProgram1: any = {'value': 'Program:'};
    pgma2: any = {};
    labelReversedBy: any = {'value': 'Reversed By  :'};
    usrb1: any = {};
    labelOn2: any = {'value': 'On:'};
    dteb1: any = {};
    tmeb1: any = {};
    labelProgram2: any = {'value': 'Program:'};
    pgmb1: any = {};
    labelAuthorizedBy1: any = {'value': 'Authorized By:'};
    usrb2: any = {};
    labelOn3: any = {'value': 'On:'};
    dteb2: any = {};
    tmeb2: any = {};
    labelProgram3: any = {'value': 'Program:'};
    pgmb2: any = {};

    public FIELDS: string[] = ['csrrec', 'csrfld', 'csrpos', 'labelViewTransactions', 'labelSubmitTransaction', 'date1', 'time1', 'labelUser', 'pgmname', 'ftrtext', 'trnid', 'labelStatus', 'status', 'statusdtl', 'cardnum', 'typecd', 'categcd', 'source', 'dess', 'amountedt', 'amountdsp', 'merchid', 'merchname', 'origdate', 'procdate', 'labelSubmittedBy', 'usra1', 'labelOn', 'dtea1', 'tmea1', 'labelProgram', 'pgma1', 'labelAuthorizedBy', 'usra2', 'labelOn1', 'dtea2', 'tmea2', 'labelProgram1', 'pgma2', 'labelReversedBy', 'usrb1', 'labelOn2', 'dteb1', 'tmeb1', 'labelProgram2', 'pgmb1', 'labelAuthorizedBy1', 'usrb2', 'labelOn3', 'dteb2', 'tmeb2', 'labelProgram3', 'pgmb2'];
    public LINES: number[] = [1, 2, 4, 5, 7, 9, 10, 12, 14, 16, 17, 19, 20, 22];

    ngAfterViewInit(): void {
        this.typecd.authorizedValues = ['01', '02'];
        this.source.authorizedValues = ['P', 'W', 'O'];
        this.trnid.comp = ['GT', '100000000000000'];
        this.csrpos.numerical = 'NUM_SIGNED';
        this.trnid.numerical = 'NUM_DIG';
        this.cardnum.numerical = 'NUM_STD';
        this.merchid.numerical = 'NUM_STD';
        this.dtea1.numerical = 'NUM_STD';
        this.tmea1.numerical = 'NUM_STD';
        this.dtea2.numerical = 'NUM_STD';
        this.tmea2.numerical = 'NUM_STD';
        this.dteb1.numerical = 'NUM_STD';
        this.tmeb1.numerical = 'NUM_STD';
        this.dteb2.numerical = 'NUM_STD';
        this.tmeb2.numerical = 'NUM_STD';
    }
}
