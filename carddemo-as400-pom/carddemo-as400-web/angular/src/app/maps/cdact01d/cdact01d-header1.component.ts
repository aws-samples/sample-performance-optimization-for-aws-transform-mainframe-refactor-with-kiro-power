import { Component } from '@angular/core';
import { Overlay } from "./../commonMap/overlay";

@Component({
    selector: 'cdact01d-header1',
    standalone: false,
    templateUrl: './cdact01d-header1.component.html'
})
export class Cdact01dHeader1Component extends Overlay {
    labelAccountMainScreen: any = {'value': 'Account Main Screen'};
    date1: any = {};
    time1: any = {};
    labelUser: any = {};
    pgmname: any = {};

    public FIELDS: string[] = ['labelAccountMainScreen', 'date1', 'time1', 'labelUser', 'pgmname'];
    public LINES: number[] = [1, 2];

    ngAfterViewInit(): void {
    }
}
