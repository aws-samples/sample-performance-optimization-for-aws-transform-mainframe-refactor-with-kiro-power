import { Component } from '@angular/core';
import { Window } from "./../commonMap/window";

@Component({
    selector: 'cdact01d-filterwin',
    standalone: false,
    templateUrl: './cdact01d-filterwin.component.html'
})
export class Cdact01dFilterwinSubComponent extends Window {
    labelFilterOption: any = {'value': 'Filter Option'};
    custfltr: any = {};
    labelFilterValueMustBeNumeric: any = {'value': 'Filter value must be numeric.'};
    labelEnterYOrBlank: any = {'value': 'Enter Y or blank.'};
    messageline: any = {};

    public FIELDS: string[] = ['labelFilterOption', 'custfltr', 'labelFilterValueMustBeNumeric', 'labelEnterYOrBlank', 'messageline'];
    public LINES: number[] = [2, 4, 7, 8];

    ngAfterViewInit(): void {
    }
}
