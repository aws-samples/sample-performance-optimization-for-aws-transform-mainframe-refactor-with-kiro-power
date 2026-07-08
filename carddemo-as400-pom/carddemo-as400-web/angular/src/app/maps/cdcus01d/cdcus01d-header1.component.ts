import { Component } from '@angular/core';
import { Overlay } from "./../commonMap/overlay";

@Component({
    selector: 'cdcus01d-header1',
    standalone: false,
    templateUrl: './cdcus01d-header1.component.html'
})
export class Cdcus01dHeader1Component extends Overlay {
    labelCustomerMainScreen: any = {'value': 'Customer Main Screen'};
    date1: any = {};
    time1: any = {};
    labelUser: any = {};
    pgmname: any = {};

    public FIELDS: string[] = ['labelCustomerMainScreen', 'date1', 'time1', 'labelUser', 'pgmname'];
    public LINES: number[] = [1, 2];

    ngAfterViewInit(): void {
    }
}
