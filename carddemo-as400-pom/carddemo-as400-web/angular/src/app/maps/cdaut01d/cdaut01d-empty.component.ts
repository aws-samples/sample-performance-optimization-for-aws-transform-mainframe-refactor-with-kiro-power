import { Component } from '@angular/core';
import { Overlay } from "./../commonMap/overlay";

@Component({
    selector: 'cdaut01d-empty',
    standalone: false,
    templateUrl: './cdaut01d-empty.component.html'
})
export class Cdaut01dEmptyComponent extends Overlay {

    public FIELDS: string[] = [];
    public LINES: number[] = [8];

    ngAfterViewInit(): void {
    }
}
