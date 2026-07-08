import { Component, ViewChild } from '@angular/core';
import { Overlay } from "./../commonMap/overlay";
import { TableComponent, Paging } from "../../table/table.component";

@Component({
    selector: 'cdcus03d-ctl1',
    standalone: false,
    templateUrl: './cdcus03d-ctl1.component.html'
})
export class Cdcus03dCtl1Component extends Overlay {
    sfl1: any = [];

    public FIELDS: string[] = ['sfl1'];
    public SFLLINES: number[] = [8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20];
    public LINES: number[] = [];

    ngAfterViewInit(): void {
    }

    public isSubfileControl: boolean = true;
    public pagingMode: number = Paging.File;
    @ViewChild('table') subfileTable: TableComponent;

    displaySfl() {
        let classValue = "lgr_col";
        if(this.sfl1.attributes.display !== true || this.sfl1.length == 0) {
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
        let result = this.sfl1.attributes.recordNumber < 0 || (this.sfl1.length > 0 && this.sfl1.attributes.recordNumber > this.sfl1.length);
        if(this.subfileTable !== undefined){
        	this.subfileTable.updateAttribute(this.sfl1.attributes);
        }
        return result;
    }

    public clearSubfile(): void {
        if(this.subfileTable !== undefined){
        	this.subfileTable.rows = [];
        }
        this.sfl1 = [];
    }
}
