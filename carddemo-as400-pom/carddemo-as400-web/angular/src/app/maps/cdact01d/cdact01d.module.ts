import { NgModule } from '@angular/core';
import { Cdact01dHeader1Component } from './cdact01d-header1.component';
import { Cdact01dHeader2Component } from './cdact01d-header2.component';
import { Cdact01dSfl1Component } from './cdact01d-sfl1.component';
import { Cdact01dCtl1Component } from './cdact01d-ctl1.component';
import { Cdact01dFooterComponent } from './cdact01d-footer.component';
import { Cdact01dFilterwinComponent } from './cdact01d-filterwin.component';
import { Cdact01dFilterwinSubComponent } from './cdact01d-filterwin-sub.component';
import { Cdact01dDelwinComponent } from './cdact01d-delwin.component';
import { Cdact01dDelwinSubComponent } from './cdact01d-delwin-sub.component';
import { Cdact01dDelerrwinComponent } from './cdact01d-delerrwin.component';
import { Cdact01dDelerrwinSubComponent } from './cdact01d-delerrwin-sub.component';
import { Cdact01dMsgsflComponent } from './cdact01d-msgsfl.component';
import { Cdact01dMsgsflcComponent } from './cdact01d-msgsflc.component';
import { Cdact01dEmptyComponent } from './cdact01d-empty.component';
import { SharedModule } from '../../shared.module';
import { MapRegistryService } from '../../services/map-registry.service';
import { Cdact01dComponentsMap, Cdact01dSubComponentsMap } from '.';

@NgModule({
    imports: [SharedModule],
    exports: [],
    declarations: [Cdact01dHeader1Component,
		Cdact01dHeader2Component,
		Cdact01dSfl1Component,
		Cdact01dCtl1Component,
		Cdact01dFooterComponent,
		Cdact01dFilterwinComponent,
		Cdact01dFilterwinSubComponent,
		Cdact01dDelwinComponent,
		Cdact01dDelwinSubComponent,
		Cdact01dDelerrwinComponent,
		Cdact01dDelerrwinSubComponent,
		Cdact01dMsgsflComponent,
		Cdact01dMsgsflcComponent,
		Cdact01dEmptyComponent]
})
export class Cdact01dModule {
  constructor(mapRegistryService: MapRegistryService) {
    mapRegistryService.registerModuleComponents(Cdact01dComponentsMap);
    mapRegistryService.registerModuleSubComponents(Cdact01dSubComponentsMap);
  }
}

