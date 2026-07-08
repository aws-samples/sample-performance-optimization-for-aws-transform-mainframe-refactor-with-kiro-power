import { Component } from '@angular/core';
import { Overlay } from "./../commonMap/overlay";

@Component({
    selector: 'cdcca01d-footer',
    standalone: false,
    templateUrl: './cdcca01d-footer.component.html'
})
export class Cdcca01dFooterComponent extends Overlay {

    public FIELDS: string[] = [];
    public LINES: number[] = [21, 22];

    ngAfterViewInit(): void {
    }
}
