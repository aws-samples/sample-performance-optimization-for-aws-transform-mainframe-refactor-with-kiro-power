import { Component } from '@angular/core';
import { Overlay } from "./../commonMap/overlay";

@Component({
    selector: 'cdact01d-empty',
    standalone: false,
    templateUrl: './cdact01d-empty.component.html'
})
export class Cdact01dEmptyComponent extends Overlay {

    public FIELDS: string[] = [];
    public LINES: number[] = [9];

    ngAfterViewInit(): void {
    }
}
