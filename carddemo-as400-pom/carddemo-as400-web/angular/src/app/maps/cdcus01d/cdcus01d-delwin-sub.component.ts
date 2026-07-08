import { Component } from '@angular/core';
import { Window } from "./../commonMap/window";

@Component({
    selector: 'cdcus01d-delwin',
    standalone: false,
    templateUrl: './cdcus01d-delwin.component.html'
})
export class Cdcus01dDelwinSubComponent extends Window {
    labelDeleteCustomer: any = {'value': 'Delete Customer'};
    custid: any = {};
    messageline: any = {};

    public FIELDS: string[] = ['labelDeleteCustomer', 'custid', 'messageline'];
    public LINES: number[] = [1, 3, 5, 7];

    ngAfterViewInit(): void {
    }
}
