import { Component } from '@angular/core';
import { Window } from "./../commonMap/window";

@Component({
    selector: 'cdcus01d-delerrwin',
    standalone: false,
    templateUrl: './cdcus01d-delerrwin.component.html'
})
export class Cdcus01dDelerrwinSubComponent extends Window {
    labelDeleteCustomer: any = {'value': 'Delete Customer'};
    custid: any = {};
    actid: any = {};
    errdelw: any = {};
    messageline: any = {};

    public FIELDS: string[] = ['labelDeleteCustomer', 'custid', 'actid', 'errdelw', 'messageline'];
    public LINES: number[] = [1, 3, 5, 7];

    ngAfterViewInit(): void {
    }
}
