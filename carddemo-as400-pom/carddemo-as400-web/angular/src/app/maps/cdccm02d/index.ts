import { Cdccm02dScrn1Component } from './cdccm02d-scrn1.component';
import { Cdccm02dConfirmComponent } from './cdccm02d-confirm.component';
import { Cdccm02dConfirmSubComponent } from './cdccm02d-confirm-sub.component';
import { Cdccm02dMsgsflComponent } from './cdccm02d-msgsfl.component';
import { Cdccm02dMsgsflcComponent } from './cdccm02d-msgsflc.component';

export { Cdccm02dModule } from './cdccm02d.module';

export const Cdccm02dSubComponentsMap = {
	"cdccm02d-confirm": Cdccm02dConfirmSubComponent
};

export const Cdccm02dComponentsMap = {
	"cdccm02d-scrn1": Cdccm02dScrn1Component,
	"cdccm02d-confirm": Cdccm02dConfirmComponent,
	"cdccm02d-msgsfl": Cdccm02dMsgsflComponent,
	"cdccm02d-msgsflc": Cdccm02dMsgsflcComponent
};

