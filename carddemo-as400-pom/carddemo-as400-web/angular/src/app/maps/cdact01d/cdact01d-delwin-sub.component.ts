import { Component } from '@angular/core';
import { Window } from "./../commonMap/window";

@Component({
    selector: 'cdact01d-delwin',
    standalone: false,
    templateUrl: './cdact01d-delwin.component.html'
})
export class Cdact01dDelwinSubComponent extends Window {
    labelInactivateAccount: any = {'value': 'Inactivate Account'};
    actid: any = {};
    messageline: any = {};

    public FIELDS: string[] = ['labelInactivateAccount', 'actid', 'messageline'];
    public LINES: number[] = [1, 3, 5, 7];

    ngAfterViewInit(): void {
    }
}
