import { Component, Input, AfterContentChecked} from '@angular/core';
import { Overlay } from "./../commonMap/overlay";

@Component({
    selector: 'cdact02d-msgsfl',
    standalone: false,
    templateUrl: './cdact02d-msgsfl.component.html'
})
export class Cdact02dMsgsflComponent extends Overlay implements AfterContentChecked {
    @Input() msgsfl: any;
    @Input() index: number;
    @Input() colid: number = 0;

    sflmsgkey: any = {};
    pgmq: any = {};
    subfileMessageLine: any = {};
    subfileSecondMessageLine: any = {};
    subfileMessageId: any = {};

    public FIELDS: string[] = ['sflmsgkey', 'pgmq', 'subfileMessageLine', 'subfileSecondMessageLine', 'subfileMessageId'];

    ngAfterContentChecked(): void {
        this.sflmsgkey = this.msgsfl.sflmsgkey;
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
