import { Component, ViewChild } from '@angular/core';
import { Overlay } from "./../commonMap/overlay";
import { TableComponent, Paging } from "../../table/table.component";

@Component({
    selector: 'cdtrn02d-msgsflc',
    standalone: false,
    templateUrl: './cdtrn02d-msgsflc.component.html'
})
export class Cdtrn02dMsgsflcComponent extends Overlay {
    pgmq: any = {};
    msgsfl: any = [];

    public FIELDS: string[] = ['pgmq', 'msgsfl'];
    public SFLLINES: number[] = [24];
    public LINES: number[] = [];

    ngAfterViewInit(): void {
    }

    public isSubfileControl: boolean = true;
    public pagingMode: number = Paging.File;
    @ViewChild('table') subfileTable: TableComponent;

    displaySfl() {
        let classValue = "lgr_col";
        if(this.msgsfl.attributes.display !== true || this.msgsfl.length == 0) {
            classValue += " empty";
        }
        return classValue;
    }

    public doPaging(key: KeyboardEvent): boolean {
        return this.subfileTable.keyEvent(key);
    }

    public doDropFold(key: KeyboardEvent): boolean {
        let result = this.subfileTable.handleDropFold(key);
        return result;
    }

    public updateSubfile(): boolean {
        let result = this.msgsfl.attributes.recordNumber < 0 || (this.msgsfl.length > 0 && this.msgsfl.attributes.recordNumber > this.msgsfl.length);
        if(this.subfileTable !== undefined){
        	this.subfileTable.updateAttribute(this.msgsfl.attributes);
        }
        return result;
    }

    public clearSubfile(): void {
        if(this.subfileTable !== undefined){
        	this.subfileTable.rows = [];
        }
        this.msgsfl = [];
    }
}
