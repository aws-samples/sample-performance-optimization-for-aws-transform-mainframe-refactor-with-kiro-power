import { Component } from '@angular/core';
import { Overlay } from "./../commonMap/overlay";

@Component({
    selector: 'cdtrn01d-header',
    standalone: false,
    templateUrl: './cdtrn01d-header.component.html'
})
export class Cdtrn01dHeaderComponent extends Overlay {
    labelTransactionMainScreen: any = {'value': 'Transaction Main Screen'};
    date1: any = {};
    time1: any = {};
    labelUser: any = {};
    pgmname: any = {};
    d1posto: any = {};
    label: any = {'value': '?'};
    labelTransactionId: any = {'value': 'Transaction ID'};
    labelProcessDt: any = {'value': 'Process Dt'};
    labelDescription: any = {'value': 'Description'};
    labelAmount: any = {'value': 'Amount'};
    labelSts: any = {'value': 'Sts'};

    public FIELDS: string[] = ['labelTransactionMainScreen', 'date1', 'time1', 'labelUser', 'pgmname', 'd1posto', 'label', 'labelTransactionId', 'labelProcessDt', 'labelDescription', 'labelAmount', 'labelSts'];
    public LINES: number[] = [1, 2, 4, 5, 7];

    ngAfterViewInit(): void {
        this.d1posto.numerical = 'NUM_SIGNED';
    }
}
