import { NgModule } from '@angular/core';
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
import { SharedModule } from '../../shared.module';
import { MapRegistryService } from '../../services/map-registry.service';
import { Cdccm01dComponentsMap, Cdccm01dSubComponentsMap } from '.';

@NgModule({
    imports: [SharedModule],
    exports: [],
    declarations: [Cdccm01dHeader1Component,
		Cdccm01dHeader2Component,
		Cdccm01dSfl1Component,
		Cdccm01dCtl1Component,
		Cdccm01dFooterComponent,
		Cdccm01dDelwinComponent,
		Cdccm01dDelwinSubComponent,
		Cdccm01dDelerrwinComponent,
		Cdccm01dDelerrwinSubComponent,
		Cdccm01dStatuswinComponent,
		Cdccm01dStatuswinSubComponent,
		Cdccm01dMsgsflComponent,
		Cdccm01dMsgsflcComponent,
		Cdccm01dEmptyComponent]
})
export class Cdccm01dModule {
  constructor(mapRegistryService: MapRegistryService) {
    mapRegistryService.registerModuleComponents(Cdccm01dComponentsMap);
    mapRegistryService.registerModuleSubComponents(Cdccm01dSubComponentsMap);
  }
}

