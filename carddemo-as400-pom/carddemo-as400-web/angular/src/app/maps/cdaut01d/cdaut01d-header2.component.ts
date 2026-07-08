import { Component } from '@angular/core';
import { Overlay } from "./../commonMap/overlay";

@Component({
    selector: 'cdaut01d-header2',
    standalone: false,
    templateUrl: './cdaut01d-header2.component.html'
})
export class Cdaut01dHeader2Component extends Overlay {
    labelAuthorizationId: any = {'value': 'Authorization ID'};
    labelTransactionId: any = {'value': 'Transaction ID'};
    labelCreditCardNumber: any = {'value': 'Credit Card Number'};
    labelResponseReason: any = {'value': 'Response Reason'};
    labelFraudFlag: any = {'value': 'Fraud Flag'};
    labelAuthDate: any = {'value': 'Auth Date'};
    labelAuthTime: any = {'value': 'Auth Time'};
    position: any = {};

    public FIELDS: string[] = ['labelAuthorizationId', 'labelTransactionId', 'labelCreditCardNumber', 'labelResponseReason', 'labelFraudFlag', 'labelAuthDate', 'labelAuthTime', 'position'];
    public LINES: number[] = [4, 6];

    ngAfterViewInit(): void {
        this.position.numerical = 'NUM_SIGNED';
    }
}
