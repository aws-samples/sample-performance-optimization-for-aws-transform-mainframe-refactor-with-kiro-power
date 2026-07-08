import { Cdccm01dHeader1Component } from './cdccm01d-header1.component';
import { Cdccm01dHeader2Component } from './cdccm01d-header2.component';
import { Cdccm01dSfl1Component } from './cdccm01d-sfl1.component';
import { Cdccm01dCtl1Component } from './cdccm01d-ctl1.component';
import { Cdccm01dFooterComponent } from './cdccm01d-footer.component';
import { Cdccm01dDelwinComponent } from './cdccm01d-delwin.component';
import { Cdccm01dDelwinSubComponent } from './cdccm01d-delwin-sub.component';
import { Cdccm01dDelerrwinComponent } from './cdccm01d-delerrwin.component';
import { Cdccm01dDelerrwinSubComponent } from './cdccm01d-delerrwin-sub.component';
import { Cdccm01dStatuswinComponent } from './cdccm01d-statuswin.component';
import { Cdccm01dStatuswinSubComponent } from './cdccm01d-statuswin-sub.component';
import { Cdccm01dMsgsflComponent } from './cdccm01d-msgsfl.component';
import { Cdccm01dMsgsflcComponent } from './cdccm01d-msgsflc.component';
import { Cdccm01dEmptyComponent } from './cdccm01d-empty.component';

export { Cdccm01dModule } from './cdccm01d.module';

export const Cdccm01dSubComponentsMap = {
	"cdccm01d-delwin": Cdccm01dDelwinSubComponent,
	"cdccm01d-delerrwin": Cdccm01dDelerrwinSubComponent,
	"cdccm01d-statuswin": Cdccm01dStatuswinSubComponent
};

export const Cdccm01dComponentsMap = {
	"cdccm01d-header1": Cdccm01dHeader1Component,
	"cdccm01d-header2": Cdccm01dHeader2Component,
	"cdccm01d-sfl1": Cdccm01dSfl1Component,
	"cdccm01d-ctl1": Cdccm01dCtl1Component,
	"cdccm01d-footer": Cdccm01dFooterComponent,
	"cdccm01d-delwin": Cdccm01dDelwinComponent,
	"cdccm01d-delerrwin": Cdccm01dDelerrwinComponent,
	"cdccm01d-statuswin": Cdccm01dStatuswinComponent,
	"cdccm01d-msgsfl": Cdccm01dMsgsflComponent,
	"cdccm01d-msgsflc": Cdccm01dMsgsflcComponent,
	"cdccm01d-empty": Cdccm01dEmptyComponent
};

