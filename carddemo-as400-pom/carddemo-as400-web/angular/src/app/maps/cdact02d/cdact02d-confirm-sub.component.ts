import { Component } from '@angular/core';
import { Window } from "./../commonMap/window";

@Component({
    selector: 'cdact02d-confirm',
    standalone: false,
    templateUrl: './cdact02d-confirm.component.html'
})
export class Cdact02dConfirmSubComponent extends Window {
    labelAddAccount: any = {'value': 'Add Account'};
    labelUpdateAccount: any = {'value': 'Update Account'};
    messageline: any = {};

    public FIELDS: string[] = ['labelAddAccount', 'labelUpdateAccount', 'messageline'];
    public LINES: number[] = [2, 4, 6, 7];

    ngAfterViewInit(): void {
    }
}
