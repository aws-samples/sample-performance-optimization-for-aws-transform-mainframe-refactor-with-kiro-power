import { Component } from '@angular/core';
import { Overlay } from "./../commonMap/overlay";

@Component({
    selector: 'cdaut01d-footer',
    standalone: false,
    templateUrl: './cdaut01d-footer.component.html'
})
export class Cdaut01dFooterComponent extends Overlay {
    dashes: any = {};

    public FIELDS: string[] = ['dashes'];
    public LINES: number[] = [24, 25];

    ngAfterViewInit(): void {
    }
}
