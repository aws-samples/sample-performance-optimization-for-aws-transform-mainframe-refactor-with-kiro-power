import { Component } from '@angular/core';
import { Overlay } from "./../commonMap/overlay";

@Component({
    selector: 'cdcca01d-header1',
    standalone: false,
    templateUrl: './cdcca01d-header1.component.html'
})
export class Cdcca01dHeader1Component extends Overlay {
    date1: any = {};
    time1: any = {};
    labelUser: any = {};
    pgmname: any = {};
    labelCardActivityHistory: any = {'value': 'Card Activity History'};
    cardnum: any = {'value': 'CREDIT CARD NUMBER'};
    labelActivity: any = {'value': 'Activity'};
    labelDescription: any = {'value': 'Description'};
    labelUser1: any = {'value': 'User'};
    labelTimestamp: any = {'value': 'Timestamp'};

    public FIELDS: string[] = ['date1', 'time1', 'labelUser', 'pgmname', 'labelCardActivityHistory', 'cardnum', 'labelActivity', 'labelDescription', 'labelUser1', 'labelTimestamp'];
    public LINES: number[] = [1, 2, 4, 6];

    ngAfterViewInit(): void {
        this.cardnum.numerical = 'NUM_STD';
    }
}
