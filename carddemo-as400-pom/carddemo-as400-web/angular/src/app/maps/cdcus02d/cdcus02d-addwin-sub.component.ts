import { Component } from '@angular/core';
import { Window } from "./../commonMap/window";

@Component({
    selector: 'cdcus02d-addwin',
    standalone: false,
    templateUrl: './cdcus02d-addwin.component.html'
})
export class Cdcus02dAddwinSubComponent extends Window {
    labelAddCustomer: any = {'value': 'Add Customer'};
    labelUpdateCustomer: any = {'value': 'Update Customer'};
    messageline: any = {};

    public FIELDS: string[] = ['labelAddCustomer', 'labelUpdateCustomer', 'messageline'];
    public LINES: number[] = [2, 4, 6, 7];

    ngAfterViewInit(): void {
    }
}
