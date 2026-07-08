import { Component } from '@angular/core';
import { Overlay } from "./../commonMap/overlay";

@Component({
    selector: 'cdact01d-footer',
    standalone: false,
    templateUrl: './cdact01d-footer.component.html'
})
export class Cdact01dFooterComponent extends Overlay {
    varyft: any = {};

    public FIELDS: string[] = ['varyft'];
    public LINES: number[] = [21, 22];

    ngAfterViewInit(): void {
    }
}
