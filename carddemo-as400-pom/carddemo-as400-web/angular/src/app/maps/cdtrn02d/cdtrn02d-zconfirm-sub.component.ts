import { Component } from '@angular/core';
import { Window } from "./../commonMap/window";

@Component({
    selector: 'cdtrn02d-zconfirm',
    standalone: false,
    templateUrl: './cdtrn02d-zconfirm.component.html'
})
export class Cdtrn02dZconfirmSubComponent extends Window {
    yesno: any = {};
    messageline: any = {};

    public FIELDS: string[] = ['yesno', 'messageline'];
    public LINES: number[] = [2];

    ngAfterViewInit(): void {
        this.yesno.authorizedValues = ['Y', 'N'];
    }

    validate(): void {
        document.dispatchEvent( new KeyboardEvent( 'keydown', { key: 'Enter' } ) );
    }
}
