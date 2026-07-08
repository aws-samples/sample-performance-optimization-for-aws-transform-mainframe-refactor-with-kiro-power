import { Component } from '@angular/core';
import { Overlay } from "./../commonMap/overlay";

@Component({
    selector: 'cdcus03d-header1',
    standalone: false,
    templateUrl: './cdcus03d-header1.component.html'
})
export class Cdcus03dHeader1Component extends Overlay {
    date1: any = {};
    time1: any = {};
    labelUser: any = {};
    pgmname: any = {};
    labelSelectCustomer: any = {'value': 'Select Customer'};

    public FIELDS: string[] = ['date1', 'time1', 'labelUser', 'pgmname', 'labelSelectCustomer'];
    public LINES: number[] = [1, 2];

    ngAfterViewInit(): void {
    }
}
