import { Component } from '@angular/core';
import { Overlay } from "./../commonMap/overlay";

@Component({
    selector: 'cdccm01d-empty',
    standalone: false,
    templateUrl: './cdccm01d-empty.component.html'
})
export class Cdccm01dEmptyComponent extends Overlay {

    public FIELDS: string[] = [];
    public LINES: number[] = [9];

    ngAfterViewInit(): void {
    }
}
