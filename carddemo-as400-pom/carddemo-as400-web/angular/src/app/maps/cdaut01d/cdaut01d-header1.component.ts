import { Component } from '@angular/core';
import { Overlay } from "./../commonMap/overlay";

@Component({
    selector: 'cdaut01d-header1',
    standalone: false,
    templateUrl: './cdaut01d-header1.component.html'
})
export class Cdaut01dHeader1Component extends Overlay {
    labelAuthorizationMainScreen: any = {'value': 'Authorization Main Screen'};
    date1: any = {};
    time1: any = {};
    labelUser: any = {};
    pgmname: any = {};

    public FIELDS: string[] = ['labelAuthorizationMainScreen', 'date1', 'time1', 'labelUser', 'pgmname'];
    public LINES: number[] = [1, 2];

    ngAfterViewInit(): void {
    }
}
