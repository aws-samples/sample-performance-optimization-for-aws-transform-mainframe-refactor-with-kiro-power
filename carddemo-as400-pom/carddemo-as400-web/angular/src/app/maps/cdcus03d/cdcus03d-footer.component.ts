import { Component } from '@angular/core';
import { Overlay } from "./../commonMap/overlay";

@Component({
    selector: 'cdcus03d-footer',
    standalone: false,
    templateUrl: './cdcus03d-footer.component.html'
})
export class Cdcus03dFooterComponent extends Overlay {

    public FIELDS: string[] = [];
    public LINES: number[] = [21, 22];

    ngAfterViewInit(): void {
    }
}
