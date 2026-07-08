import { Component } from '@angular/core';
import { Overlay } from "./../commonMap/overlay";

@Component({
    selector: 'cdcus01d-header2',
    standalone: false,
    templateUrl: './cdcus01d-header2.component.html'
})
export class Cdcus01dHeader2Component extends Overlay {
    label: any = {'value': '?'};
    labelCustomerId: any = {'value': 'Customer ID'};
    labelFirstName: any = {'value': 'First Name'};
    labelLastName: any = {'value': 'Last Name'};
    position: any = {};

    public FIELDS: string[] = ['label', 'labelCustomerId', 'labelFirstName', 'labelLastName', 'position'];
    public LINES: number[] = [4, 5, 7];

    ngAfterViewInit(): void {
    }
}
