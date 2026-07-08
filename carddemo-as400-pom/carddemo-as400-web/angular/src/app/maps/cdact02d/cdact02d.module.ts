import { NgModule } from '@angular/core';
import { Cdact02dScrn1Component } from './cdact02d-scrn1.component';
import { Cdact02dConfirmComponent } from './cdact02d-confirm.component';
import { Cdact02dConfirmSubComponent } from './cdact02d-confirm-sub.component';
import { Cdact02dMsgsflComponent } from './cdact02d-msgsfl.component';
import { Cdact02dMsgsflcComponent } from './cdact02d-msgsflc.component';
import { SharedModule } from '../../shared.module';
import { MapRegistryService } from '../../services/map-registry.service';
import { Cdact02dComponentsMap, Cdact02dSubComponentsMap } from '.';

@NgModule({
    imports: [SharedModule],
    exports: [],
    declarations: [Cdact02dScrn1Component,
		Cdact02dConfirmComponent,
		Cdact02dConfirmSubComponent,
		Cdact02dMsgsflComponent,
		Cdact02dMsgsflcComponent]
})
export class Cdact02dModule {
  constructor(mapRegistryService: MapRegistryService) {
    mapRegistryService.registerModuleComponents(Cdact02dComponentsMap);
    mapRegistryService.registerModuleSubComponents(Cdact02dSubComponentsMap);
  }
}

