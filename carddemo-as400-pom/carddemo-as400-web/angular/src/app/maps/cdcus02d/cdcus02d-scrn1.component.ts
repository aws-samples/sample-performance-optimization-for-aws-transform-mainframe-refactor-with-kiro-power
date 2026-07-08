import { Component } from '@angular/core';
import { Overlay } from "./../commonMap/overlay";

@Component({
    selector: 'cdcus02d-scrn1',
    standalone: false,
    templateUrl: './cdcus02d-scrn1.component.html'
})
export class Cdcus02dScrn1Component extends Overlay {
    csrrec: any = {};
    csrfld: any = {};
    csrpos: any = {};
    labelViewCustomer: any = {'value': 'View Customer'};
    labelAddCustomer: any = {'value': 'Add Customer'};
    labelUpdateCustomer: any = {'value': 'Update Customer'};
    date1: any = {};
    time1: any = {};
    labelUser: any = {};
    pgmname: any = {};
    custid: any = {};
    ssn: any = {};
    ficoscore: any = {};
    dob: any = {};
    birthyr: any = {};
    birthmo: any = {};
    birthday: any = {};
    gender: any = {};
    firstname: any = {};
    middlename: any = {};
    lastname: any = {};
    address1: any = {};
    address2: any = {};
    city: any = {};
    state: any = {};
    zip: any = {};
    country: any = {};
    phone1area: any = {};
    phone1f3: any = {};
    phone1l4: any = {};
    phone2area: any = {};
    phone2f3: any = {};
    phone2l4: any = {};
    labelCreatedBy: any = {'value': 'Created By:'};
    cuscrtusr: any = {};
    labelOn: any = {'value': 'On:'};
    cuscrtdt: any = {};
    cuscrttm: any = {};
    labelProgram: any = {'value': 'Program:'};
    cuscrtpgm: any = {};
    labelUpdatedBy: any = {'value': 'Updated By:'};
    cuschgusr: any = {};
    labelOn1: any = {'value': 'On:'};
    cuschgdt: any = {};
    cuschgtm: any = {};
    labelProgram1: any = {'value': 'Program:'};
    cuschgpgm: any = {};

    public FIELDS: string[] = ['csrrec', 'csrfld', 'csrpos', 'labelViewCustomer', 'labelAddCustomer', 'labelUpdateCustomer', 'date1', 'time1', 'labelUser', 'pgmname', 'custid', 'ssn', 'ficoscore', 'dob', 'birthyr', 'birthmo', 'birthday', 'gender', 'firstname', 'middlename', 'lastname', 'address1', 'address2', 'city', 'state', 'zip', 'country', 'phone1area', 'phone1f3', 'phone1l4', 'phone2area', 'phone2f3', 'phone2l4', 'labelCreatedBy', 'cuscrtusr', 'labelOn', 'cuscrtdt', 'cuscrttm', 'labelProgram', 'cuscrtpgm', 'labelUpdatedBy', 'cuschgusr', 'labelOn1', 'cuschgdt', 'cuschgtm', 'labelProgram1', 'cuschgpgm'];
    public LINES: number[] = [1, 2, 4, 6, 7, 9, 10, 11, 13, 14, 15, 16, 17, 19, 20, 22];

    ngAfterViewInit(): void {
        this.csrpos.numerical = 'NUM_SIGNED';
        this.cuscrtdt.numerical = 'NUM_STD';
        this.cuscrttm.numerical = 'NUM_STD';
        this.cuschgdt.numerical = 'NUM_STD';
        this.cuschgtm.numerical = 'NUM_STD';
    }
}
