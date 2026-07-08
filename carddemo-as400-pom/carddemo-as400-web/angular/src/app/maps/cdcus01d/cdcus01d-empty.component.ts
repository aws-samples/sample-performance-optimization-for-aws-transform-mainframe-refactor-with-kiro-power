import { Component } from '@angular/core';
import { Overlay } from "./../commonMap/overlay";

@Component({
    selector: 'cdcus01d-empty',
    standalone: false,
    templateUrl: './cdcus01d-empty.component.html'
})
export class Cdcus01dEmptyComponent extends Overlay {

    public FIELDS: string[] = [];
    public LINES: number[] = [9];

    ngAfterViewInit(): void {
    }
}
