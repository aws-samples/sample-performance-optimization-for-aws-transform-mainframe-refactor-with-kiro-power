import { NgModule } from '@angular/core';
import { Cdcus03dHeader1Component } from './cdcus03d-header1.component';
import { Cdcus03dHeader2Component } from './cdcus03d-header2.component';
import { Cdcus03dSfl1Component } from './cdcus03d-sfl1.component';
import { Cdcus03dCtl1Component } from './cdcus03d-ctl1.component';
import { Cdcus03dFooterComponent } from './cdcus03d-footer.component';
import { Cdcus03dMsgsflComponent } from './cdcus03d-msgsfl.component';
import { Cdcus03dMsgsflcComponent } from './cdcus03d-msgsflc.component';
import { Cdcus03dEmptyComponent } from './cdcus03d-empty.component';
import { SharedModule } from '../../shared.module';
import { MapRegistryService } from '../../services/map-registry.service';
import { Cdcus03dComponentsMap, Cdcus03dSubComponentsMap } from '.';

@NgModule({
    imports: [SharedModule],
    exports: [],
    declarations: [Cdcus03dHeader1Component,
		Cdcus03dHeader2Component,
		Cdcus03dSfl1Component,
		Cdcus03dCtl1Component,
		Cdcus03dFooterComponent,
		Cdcus03dMsgsflComponent,
		Cdcus03dMsgsflcComponent,
		Cdcus03dEmptyComponent]
})
export class Cdcus03dModule {
  constructor(mapRegistryService: MapRegistryService) {
    mapRegistryService.registerModuleComponents(Cdcus03dComponentsMap);
    mapRegistryService.registerModuleSubComponents(Cdcus03dSubComponentsMap);
  }
}

