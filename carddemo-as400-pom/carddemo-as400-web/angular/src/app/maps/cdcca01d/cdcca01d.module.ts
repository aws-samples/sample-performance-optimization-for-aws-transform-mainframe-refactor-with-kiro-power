import { NgModule } from '@angular/core';
import { Cdcca01dHeader1Component } from './cdcca01d-header1.component';
import { Cdcca01dSfl1Component } from './cdcca01d-sfl1.component';
import { Cdcca01dCtl1Component } from './cdcca01d-ctl1.component';
import { Cdcca01dFooterComponent } from './cdcca01d-footer.component';
import { SharedModule } from '../../shared.module';
import { MapRegistryService } from '../../services/map-registry.service';
import { Cdcca01dComponentsMap, Cdcca01dSubComponentsMap } from '.';

@NgModule({
    imports: [SharedModule],
    exports: [],
    declarations: [Cdcca01dHeader1Component,
		Cdcca01dSfl1Component,
		Cdcca01dCtl1Component,
		Cdcca01dFooterComponent]
})
export class Cdcca01dModule {
  constructor(mapRegistryService: MapRegistryService) {
    mapRegistryService.registerModuleComponents(Cdcca01dComponentsMap);
    mapRegistryService.registerModuleSubComponents(Cdcca01dSubComponentsMap);
  }
}

