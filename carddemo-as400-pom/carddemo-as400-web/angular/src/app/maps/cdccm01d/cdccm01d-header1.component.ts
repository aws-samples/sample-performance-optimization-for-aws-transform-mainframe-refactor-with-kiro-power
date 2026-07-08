import { Component } from '@angular/core';
import { Overlay } from "./../commonMap/overlay";

@Component({
    selector: 'cdccm01d-header1',
    standalone: false,
    templateUrl: './cdccm01d-header1.component.html'
})
export class Cdccm01dHeader1Component extends Overlay {
    labelCreditCardMainScreen: any = {'value': 'Credit Card Main Screen'};
    date1: any = {};
    time1: any = {};
    labelUser: any = {};
    pgmname: any = {};

    public FIELDS: string[] = ['labelCreditCardMainScreen', 'date1', 'time1', 'labelUser', 'pgmname'];
    public LINES: number[] = [1, 2];

    ngAfterViewInit(): void {
    }
}
