import { Component } from '@angular/core';
import { Window } from "./../commonMap/window";

@Component({
    selector: 'cdccm01d-statuswin',
    standalone: false,
    templateUrl: './cdccm01d-statuswin.component.html'
})
export class Cdccm01dStatuswinSubComponent extends Window {
    cardnum: any = {};
    status: any = {};
    custid: any = {};
    acctnum: any = {};
    updatetype: any = {};
    messageline: any = {};

    public FIELDS: string[] = ['cardnum', 'status', 'custid', 'acctnum', 'updatetype', 'messageline'];
    public LINES: number[] = [3, 5, 7, 9, 11];

    ngAfterViewInit(): void {
        this.cardnum.numerical = 'NUM_STD';
    }
}
