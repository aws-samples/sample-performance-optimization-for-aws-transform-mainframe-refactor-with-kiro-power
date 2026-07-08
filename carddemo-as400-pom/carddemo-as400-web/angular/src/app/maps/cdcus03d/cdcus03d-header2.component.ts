import { Component } from '@angular/core';
import { Overlay } from "./../commonMap/overlay";

@Component({
    selector: 'cdcus03d-header2',
    standalone: false,
    templateUrl: './cdcus03d-header2.component.html'
})
export class Cdcus03dHeader2Component extends Overlay {
    label: any = {'value': '?'};
    labelCustomerId: any = {'value': 'Customer ID'};
    labelFirstName: any = {'value': 'First Name'};
    labelLastName: any = {'value': 'Last Name'};
    position: any = {};

    public FIELDS: string[] = ['label', 'labelCustomerId', 'labelFirstName', 'labelLastName', 'position'];
    public LINES: number[] = [4, 5, 7];

    ngAfterViewInit(): void {
        this.position.numerical = 'NUM_SIGNED';
    }
}
