import { Component } from '@angular/core';
import { Overlay } from "./../commonMap/overlay";

@Component({
    selector: 'cdmenud-cardmenu',
    standalone: false,
    templateUrl: './cdmenud-cardmenu.component.html'
})
export class CdmenudCardmenuComponent extends Overlay {
    labelUser: any = {};
    date1: any = {};
    time1: any = {};
    cmdprompt: any = {};

    public FIELDS: string[] = ['labelUser', 'date1', 'time1', 'cmdprompt'];
    public LINES: number[] = [1, 17, 2, 19, 4, 20, 6, 7, 8, 9, 10];

    ngAfterViewInit(): void {
    }
}
