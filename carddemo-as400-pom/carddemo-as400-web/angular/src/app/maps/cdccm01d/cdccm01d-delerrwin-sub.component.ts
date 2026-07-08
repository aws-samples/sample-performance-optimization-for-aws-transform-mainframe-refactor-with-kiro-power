import { Component } from '@angular/core';
import { Window } from "./../commonMap/window";

@Component({
    selector: 'cdccm01d-delerrwin',
    standalone: false,
    templateUrl: './cdccm01d-delerrwin.component.html'
})
export class Cdccm01dDelerrwinSubComponent extends Window {
    cardnum: any = {};
    status: any = {};
    custid: any = {};
    acctnum: any = {};
    errdelw: any = {};
    messageline: any = {};

    public FIELDS: string[] = ['cardnum', 'status', 'custid', 'acctnum', 'errdelw', 'messageline'];
    public LINES: number[] = [3, 5, 7, 9];

    ngAfterViewInit(): void {
        this.cardnum.numerical = 'NUM_STD';
    }
}
