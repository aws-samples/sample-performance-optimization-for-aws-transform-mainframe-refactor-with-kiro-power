import { NgModule } from '@angular/core';
import { Cdaut01dHeader1Component } from './cdaut01d-header1.component';
import { Cdaut01dHeader2Component } from './cdaut01d-header2.component';
import { Cdaut01dSfl1Component } from './cdaut01d-sfl1.component';
import { Cdaut01dCtl1Component } from './cdaut01d-ctl1.component';
import { Cdaut01dFooterComponent } from './cdaut01d-footer.component';
import { Cdaut01dMsgsflComponent } from './cdaut01d-msgsfl.component';
import { Cdaut01dMsgsflcComponent } from './cdaut01d-msgsflc.component';
import { Cdaut01dEmptyComponent } from './cdaut01d-empty.component';
import { SharedModule } from '../../shared.module';
import { MapRegistryService } from '../../services/map-registry.service';
import { Cdaut01dComponentsMap, Cdaut01dSubComponentsMap } from '.';

@NgModule({
    imports: [SharedModule],
    exports: [],
    declarations: [Cdaut01dHeader1Component,
		Cdaut01dHeader2Component,
		Cdaut01dSfl1Component,
		Cdaut01dCtl1Component,
		Cdaut01dFooterComponent,
		Cdaut01dMsgsflComponent,
		Cdaut01dMsgsflcComponent,
		Cdaut01dEmptyComponent]
})
export class Cdaut01dModule {
  constructor(mapRegistryService: MapRegistryService) {
    mapRegistryService.registerModuleComponents(Cdaut01dComponentsMap);
    mapRegistryService.registerModuleSubComponents(Cdaut01dSubComponentsMap);
  }
}

