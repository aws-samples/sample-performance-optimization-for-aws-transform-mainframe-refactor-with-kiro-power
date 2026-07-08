import { NgModule } from '@angular/core';
import { Cdtrn01dHeaderComponent } from './cdtrn01d-header.component';
import { Cdtrn01dSfl1Component } from './cdtrn01d-sfl1.component';
import { Cdtrn01dCtl1Component } from './cdtrn01d-ctl1.component';
import { Cdtrn01dFooterComponent } from './cdtrn01d-footer.component';
import { Cdtrn01dMsgsflComponent } from './cdtrn01d-msgsfl.component';
import { Cdtrn01dMsgsflcComponent } from './cdtrn01d-msgsflc.component';
import { Cdtrn01dEmptyComponent } from './cdtrn01d-empty.component';
import { SharedModule } from '../../shared.module';
import { MapRegistryService } from '../../services/map-registry.service';
import { Cdtrn01dComponentsMap, Cdtrn01dSubComponentsMap } from '.';

@NgModule({
    imports: [SharedModule],
    exports: [],
    declarations: [Cdtrn01dHeaderComponent,
		Cdtrn01dSfl1Component,
		Cdtrn01dCtl1Component,
		Cdtrn01dFooterComponent,
		Cdtrn01dMsgsflComponent,
		Cdtrn01dMsgsflcComponent,
		Cdtrn01dEmptyComponent]
})
export class Cdtrn01dModule {
  constructor(mapRegistryService: MapRegistryService) {
    mapRegistryService.registerModuleComponents(Cdtrn01dComponentsMap);
    mapRegistryService.registerModuleSubComponents(Cdtrn01dSubComponentsMap);
  }
}

