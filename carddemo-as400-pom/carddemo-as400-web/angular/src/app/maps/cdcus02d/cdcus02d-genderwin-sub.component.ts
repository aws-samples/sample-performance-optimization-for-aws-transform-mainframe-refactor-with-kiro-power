import { Component } from '@angular/core';
import { Window } from "./../commonMap/window";

@Component({
    selector: 'cdcus02d-genderwin',
    standalone: false,
    templateUrl: './cdcus02d-genderwin.component.html'
})
export class Cdcus02dGenderwinSubComponent extends Window {
    selgen: any = {};
    messageline: any = {};

    public FIELDS: string[] = ['selgen', 'messageline'];
    public LINES: number[] = [1, 3];

    ngAfterViewInit(): void {
        this.selgen.numerical = 'NUM_STD';
    }

    validate(): void {
        document.dispatchEvent( new KeyboardEvent( 'keydown', { key: 'Enter' } ) );
    }
}
