import { NgModule } from '@angular/core';
import { Cdccm02dScrn1Component } from './cdccm02d-scrn1.component';
import { Cdccm02dConfirmComponent } from './cdccm02d-confirm.component';
import { Cdccm02dConfirmSubComponent } from './cdccm02d-confirm-sub.component';
import { Cdccm02dMsgsflComponent } from './cdccm02d-msgsfl.component';
import { Cdccm02dMsgsflcComponent } from './cdccm02d-msgsflc.component';
import { SharedModule } from '../../shared.module';
import { MapRegistryService } from '../../services/map-registry.service';
import { Cdccm02dComponentsMap, Cdccm02dSubComponentsMap } from '.';

@NgModule({
    imports: [SharedModule],
    exports: [],
    declarations: [Cdccm02dScrn1Component,
		Cdccm02dConfirmComponent,
		Cdccm02dConfirmSubComponent,
		Cdccm02dMsgsflComponent,
		Cdccm02dMsgsflcComponent]
})
export class Cdccm02dModule {
  constructor(mapRegistryService: MapRegistryService) {
    mapRegistryService.registerModuleComponents(Cdccm02dComponentsMap);
    mapRegistryService.registerModuleSubComponents(Cdccm02dSubComponentsMap);
  }
}

