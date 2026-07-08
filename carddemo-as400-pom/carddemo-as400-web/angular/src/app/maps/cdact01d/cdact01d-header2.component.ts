import { Component } from '@angular/core';
import { Overlay } from "./../commonMap/overlay";

@Component({
    selector: 'cdact01d-header2',
    standalone: false,
    templateUrl: './cdact01d-header2.component.html'
})
export class Cdact01dHeader2Component extends Overlay {
    label: any = {'value': '?'};
    labelAccountId: any = {'value': 'Account ID'};
    labelOpenDate: any = {'value': 'Open Date'};
    labelPrimaryCust: any = {'value': 'Primary Cust'};
    labelSecondaryCust: any = {'value': 'Secondary Cust'};
    labelBalance: any = {'value': 'Balance'};
    position: any = {};
    labelSts: any = {'value': 'Sts'};

    public FIELDS: string[] = ['label', 'labelAccountId', 'labelOpenDate', 'labelPrimaryCust', 'labelSecondaryCust', 'labelBalance', 'position', 'labelSts'];
    public LINES: number[] = [4, 5, 7];

    ngAfterViewInit(): void {
    }
}
