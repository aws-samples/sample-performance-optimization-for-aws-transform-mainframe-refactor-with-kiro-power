import { Component, Input, AfterContentChecked} from '@angular/core';
import { Overlay } from "./../commonMap/overlay";

@Component({
    selector: 'cdtrn01d-msgsfl',
    standalone: false,
    templateUrl: './cdtrn01d-msgsfl.component.html'
})
export class Cdtrn01dMsgsflComponent extends Overlay implements AfterContentChecked {
    @Input() msgsfl: any;
    @Input() index: number;
    @Input() colid: number = 0;

    msgkey: any = {};
    pgmq: any = {};
    subfileMessageLine: any = {};
    subfileSecondMessageLine: any = {};
    subfileMessageId: any = {};

    public FIELDS: string[] = ['msgkey', 'pgmq', 'subfileMessageLine', 'subfileSecondMessageLine', 'subfileMessageId'];

    ngAfterContentChecked(): void {
        this.msgkey = this.msgsfl.msgkey;
        this.pgmq = this.msgsfl.pgmq;
        this.subfileMessageLine = this.msgsfl.subfileMessageLine;
        this.subfileSecondMessageLine = this.msgsfl.subfileSecondMessageLine;
        this.subfileMessageId = this.msgsfl.subfileMessageId;
    }

    positionSFL(): String {
    	return "lgr_col";
    }

    ngAfterViewInit(): void {
    }

    getSFLFocus(): boolean {
        if (this.index === 0) {
            return true;
        }
        return false;
    }
}
