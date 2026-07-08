import { Component } from '@angular/core';
import { Overlay } from "./../commonMap/overlay";

@Component({
    selector: 'cdtrn01d-footer',
    standalone: false,
    templateUrl: './cdtrn01d-footer.component.html'
})
export class Cdtrn01dFooterComponent extends Overlay {

    public FIELDS: string[] = [];
    public LINES: number[] = [21, 22];

    ngAfterViewInit(): void {
    }
}
