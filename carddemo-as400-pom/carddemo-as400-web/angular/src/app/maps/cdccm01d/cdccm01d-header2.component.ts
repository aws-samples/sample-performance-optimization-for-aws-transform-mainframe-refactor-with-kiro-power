import { Component } from '@angular/core';
import { Overlay } from "./../commonMap/overlay";

@Component({
    selector: 'cdccm01d-header2',
    standalone: false,
    templateUrl: './cdccm01d-header2.component.html'
})
export class Cdccm01dHeader2Component extends Overlay {
    label: any = {'value': '?'};
    labelCreditCardNumber: any = {'value': 'Credit Card Number'};
    labelCustomerId: any = {'value': 'Customer ID'};
    labelAccountNumber: any = {'value': 'Account Number'};
    labelPrimSec: any = {'value': 'Prim\/Sec'};
    labelStatus: any = {'value': 'Status'};
    position: any = {};

    public FIELDS: string[] = ['label', 'labelCreditCardNumber', 'labelCustomerId', 'labelAccountNumber', 'labelPrimSec', 'labelStatus', 'position'];
    public LINES: number[] = [4, 5, 7];

    ngAfterViewInit(): void {
    }
}
