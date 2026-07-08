import { Component } from '@angular/core';
import { Window } from "./../commonMap/window";

@Component({
    selector: 'cdccm02d-confirm',
    standalone: false,
    templateUrl: './cdccm02d-confirm.component.html'
})
export class Cdccm02dConfirmSubComponent extends Window {
    labelCreateCreditCard: any = {'value': 'Create Credit Card'};
    labelUpdateCreditCard: any = {'value': 'Update Credit Card'};
    messageline: any = {};

    public FIELDS: string[] = ['labelCreateCreditCard', 'labelUpdateCreditCard', 'messageline'];
    public LINES: number[] = [2, 4, 6, 7];

    ngAfterViewInit(): void {
    }
}
