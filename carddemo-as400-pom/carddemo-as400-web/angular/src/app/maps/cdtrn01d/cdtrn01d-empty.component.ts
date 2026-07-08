import { Component } from '@angular/core';
import { Overlay } from "./../commonMap/overlay";

@Component({
    selector: 'cdtrn01d-empty',
    standalone: false,
    templateUrl: './cdtrn01d-empty.component.html'
})
export class Cdtrn01dEmptyComponent extends Overlay {

    public FIELDS: string[] = [];
    public LINES: number[] = [7];

    ngAfterViewInit(): void {
    }
}
