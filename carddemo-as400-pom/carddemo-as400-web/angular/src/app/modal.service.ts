import { Injectable, EventEmitter } from '@angular/core';
import { Subject, ReplaySubject } from 'rxjs';
import { LogicalMessage } from 'app/term/message';
import { AbstTermComponent } from 'app/abs-term.component';

export type ModalInfo = { message: LogicalMessage, parentComponent : AbstTermComponent};

@Injectable()
/** Service registring and managing modal component */
export class ModalService {

  /** Set of displayed modal */
  _storeModalId: Set<String> = new Set<string>();
  
   cdact01d_delerrwin: Subject<ModalInfo> = new ReplaySubject(1);
   cdact01d_delwin: Subject<ModalInfo> = new ReplaySubject(1);
   cdact01d_filterwin: Subject<ModalInfo> = new ReplaySubject(1);
   cdact02d_confirm: Subject<ModalInfo> = new ReplaySubject(1);
   cdccm01d_delerrwin: Subject<ModalInfo> = new ReplaySubject(1);
   cdccm01d_delwin: Subject<ModalInfo> = new ReplaySubject(1);
   cdccm01d_statuswin: Subject<ModalInfo> = new ReplaySubject(1);
   cdccm02d_confirm: Subject<ModalInfo> = new ReplaySubject(1);
   cdcus01d_delerrwin: Subject<ModalInfo> = new ReplaySubject(1);
   cdcus01d_delwin: Subject<ModalInfo> = new ReplaySubject(1);
   cdcus02d_addwin: Subject<ModalInfo> = new ReplaySubject(1);
   cdcus02d_genderwin: Subject<ModalInfo> = new ReplaySubject(1);
   cdtrn02d_zconfirm: Subject<ModalInfo> = new ReplaySubject(1);
   end_message: Subject<ModalInfo> = new ReplaySubject(1);
   additional_message: Subject<ModalInfo> = new ReplaySubject(1);
   help_modal: Subject<ModalInfo> = new ReplaySubject(1);
   back_err_message: Subject<ModalInfo> = new ReplaySubject(1);

  mapSubComponents = {
    "cdact01d-delerrwin": this.cdact01d_delerrwin,
    "cdact01d-delwin": this.cdact01d_delwin,
    "cdact01d-filterwin": this.cdact01d_filterwin,
    "cdact02d-confirm": this.cdact02d_confirm,
    "cdccm01d-delerrwin": this.cdccm01d_delerrwin,
    "cdccm01d-delwin": this.cdccm01d_delwin,
    "cdccm01d-statuswin": this.cdccm01d_statuswin,
    "cdccm02d-confirm": this.cdccm02d_confirm,
    "cdcus01d-delerrwin": this.cdcus01d_delerrwin,
    "cdcus01d-delwin": this.cdcus01d_delwin,
    "cdcus02d-addwin": this.cdcus02d_addwin,
    "cdcus02d-genderwin": this.cdcus02d_genderwin,
    "cdtrn02d-zconfirm": this.cdtrn02d_zconfirm,
    "end-message": this.end_message,
    "additional-message": this.additional_message,
    "help-modal": this.help_modal,
    "back-err-message": this.back_err_message
  };

  activeModal(modalId : string) : Subject<ModalInfo> {
    return this.mapSubComponents[modalId];
  }

  public pushModal(modalId: string) {
    this._storeModalId.add(modalId);
  }

  public popModal(modalId: string) {
    this._storeModalId.delete(modalId);
  }

  public containModal(): boolean {
    return this._storeModalId.size != 0;
  }
  
    public getDefaultPosLeft(): number {
    return 30;
  }
  
  public getDefaultPosTop(): number {
    return 4;
  }

  public getDefaultHeight(): number {
    return 5;
  }

  public getDefaultWidth(): number {
    return 70;
  }
  
  public modalReadyEvent = new EventEmitter<string>();
  
}

export const MODALSERVICE: any[] = [
    ModalService,
]