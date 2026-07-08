import { Component } from '@angular/core';
import { Window } from "./../commonMap/window";

@Component({
    selector: 'cdccm01d-delwin',
    standalone: false,
    templateUrl: './cdccm01d-delwin.component.html'
})
export class Cdccm01dDelwinSubComponent extends Window {
    cardnum: any = {};
    status: any = {};
    custid: any = {};
    acctnum: any = {};
    messageline: any = {};

    public FIELDS: string[] = ['cardnum', 'status', 'custid', 'acctnum', 'messageline'];
    public LINES: number[] = [3, 5, 7, 9];

    ngAfterViewInit(): void {
        this.cardnum.numerical = 'NUM_STD';
    }
}
