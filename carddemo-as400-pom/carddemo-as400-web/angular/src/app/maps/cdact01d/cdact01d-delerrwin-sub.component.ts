import { Component } from '@angular/core';
import { Window } from "./../commonMap/window";

@Component({
    selector: 'cdact01d-delerrwin',
    standalone: false,
    templateUrl: './cdact01d-delerrwin.component.html'
})
export class Cdact01dDelerrwinSubComponent extends Window {
    labelEditAccount: any = {'value': 'Edit Account'};
    labelInactivateAccount: any = {'value': 'Inactivate Account'};
    actid: any = {};
    errdelw: any = {};
    labelPrimaryCustId: any = {'value': 'Primary Cust ID   :'};
    labelSecondaryCustId: any = {'value': 'Secondary Cust ID :'};
    dpricustid: any = {};
    dseccustid: any = {};
    labelCreditCardSH: any = {'value': 'Credit Card#:'};
    dpricredit: any = {};
    labelCreditCardSH1: any = {'value': 'Credit Card#:'};
    dseccredit: any = {};
    messageline: any = {};

    public FIELDS: string[] = ['labelEditAccount', 'labelInactivateAccount', 'actid', 'errdelw', 'labelPrimaryCustId', 'labelSecondaryCustId', 'dpricustid', 'dseccustid', 'labelCreditCardSH', 'dpricredit', 'labelCreditCardSH1', 'dseccredit', 'messageline'];
    public LINES: number[] = [1, 3, 5, 7, 10, 12];

    ngAfterViewInit(): void {
        this.dpricredit.numerical = 'NUM_STD';
        this.dseccredit.numerical = 'NUM_STD';
    }
}
