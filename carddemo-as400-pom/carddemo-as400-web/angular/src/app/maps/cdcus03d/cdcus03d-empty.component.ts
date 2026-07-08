import { Component } from '@angular/core';
import { Overlay } from "./../commonMap/overlay";

@Component({
    selector: 'cdcus03d-empty',
    standalone: false,
    templateUrl: './cdcus03d-empty.component.html'
})
export class Cdcus03dEmptyComponent extends Overlay {

    public FIELDS: string[] = [];
    public LINES: number[] = [9];

    ngAfterViewInit(): void {
    }
}
