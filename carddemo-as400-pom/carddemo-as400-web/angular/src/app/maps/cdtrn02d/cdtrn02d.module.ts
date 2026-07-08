import { NgModule } from '@angular/core';
import { Cdtrn02dScrn1Component } from './cdtrn02d-scrn1.component';
import { Cdtrn02dZconfirmComponent } from './cdtrn02d-zconfirm.component';
import { Cdtrn02dZconfirmSubComponent } from './cdtrn02d-zconfirm-sub.component';
import { Cdtrn02dMsgsflComponent } from './cdtrn02d-msgsfl.component';
import { Cdtrn02dMsgsflcComponent } from './cdtrn02d-msgsflc.component';
import { SharedModule } from '../../shared.module';
import { MapRegistryService } from '../../services/map-registry.service';
import { Cdtrn02dComponentsMap, Cdtrn02dSubComponentsMap } from '.';

@NgModule({
    imports: [SharedModule],
    exports: [],
    declarations: [Cdtrn02dScrn1Component,
		Cdtrn02dZconfirmComponent,
		Cdtrn02dZconfirmSubComponent,
		Cdtrn02dMsgsflComponent,
		Cdtrn02dMsgsflcComponent]
})
export class Cdtrn02dModule {
  constructor(mapRegistryService: MapRegistryService) {
    mapRegistryService.registerModuleComponents(Cdtrn02dComponentsMap);
    mapRegistryService.registerModuleSubComponents(Cdtrn02dSubComponentsMap);
  }
}

