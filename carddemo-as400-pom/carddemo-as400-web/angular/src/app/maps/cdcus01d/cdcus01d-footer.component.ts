import { Component } from '@angular/core';
import { Overlay } from "./../commonMap/overlay";

@Component({
    selector: 'cdcus01d-footer',
    standalone: false,
    templateUrl: './cdcus01d-footer.component.html'
})
export class Cdcus01dFooterComponent extends Overlay {

    public FIELDS: string[] = [];
    public LINES: number[] = [21, 22];

    ngAfterViewInit(): void {
    }
}
