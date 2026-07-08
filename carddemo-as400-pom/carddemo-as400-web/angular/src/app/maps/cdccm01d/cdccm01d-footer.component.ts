import { Component } from '@angular/core';
import { Overlay } from "./../commonMap/overlay";

@Component({
    selector: 'cdccm01d-footer',
    standalone: false,
    templateUrl: './cdccm01d-footer.component.html'
})
export class Cdccm01dFooterComponent extends Overlay {

    public FIELDS: string[] = [];
    public LINES: number[] = [21, 22];

    ngAfterViewInit(): void {
    }
}
