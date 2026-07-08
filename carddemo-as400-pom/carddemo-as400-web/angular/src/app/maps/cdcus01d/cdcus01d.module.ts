import { NgModule } from '@angular/core';
import { Cdcus01dHeader1Component } from './cdcus01d-header1.component';
import { Cdcus01dHeader2Component } from './cdcus01d-header2.component';
import { Cdcus01dSfl1Component } from './cdcus01d-sfl1.component';
import { Cdcus01dCtl1Component } from './cdcus01d-ctl1.component';
import { Cdcus01dFooterComponent } from './cdcus01d-footer.component';
import { Cdcus01dDelwinComponent } from './cdcus01d-delwin.component';
import { Cdcus01dDelwinSubComponent } from './cdcus01d-delwin-sub.component';
import { Cdcus01dDelerrwinComponent } from './cdcus01d-delerrwin.component';
import { Cdcus01dDelerrwinSubComponent } from './cdcus01d-delerrwin-sub.component';
import { Cdcus01dMsgsflComponent } from './cdcus01d-msgsfl.component';
import { Cdcus01dMsgsflcComponent } from './cdcus01d-msgsflc.component';
import { Cdcus01dEmptyComponent } from './cdcus01d-empty.component';
import { SharedModule } from '../../shared.module';
import { MapRegistryService } from '../../services/map-registry.service';
import { Cdcus01dComponentsMap, Cdcus01dSubComponentsMap } from '.';

@NgModule({
    imports: [SharedModule],
    exports: [],
    declarations: [Cdcus01dHeader1Component,
		Cdcus01dHeader2Component,
		Cdcus01dSfl1Component,
		Cdcus01dCtl1Component,
		Cdcus01dFooterComponent,
		Cdcus01dDelwinComponent,
		Cdcus01dDelwinSubComponent,
		Cdcus01dDelerrwinComponent,
		Cdcus01dDelerrwinSubComponent,
		Cdcus01dMsgsflComponent,
		Cdcus01dMsgsflcComponent,
		Cdcus01dEmptyComponent]
})
export class Cdcus01dModule {
  constructor(mapRegistryService: MapRegistryService) {
    mapRegistryService.registerModuleComponents(Cdcus01dComponentsMap);
    mapRegistryService.registerModuleSubComponents(Cdcus01dSubComponentsMap);
  }
}

