import { NgModule } from '@angular/core';
import { Cdcus02dScrn1Component } from './cdcus02d-scrn1.component';
import { Cdcus02dAddwinComponent } from './cdcus02d-addwin.component';
import { Cdcus02dAddwinSubComponent } from './cdcus02d-addwin-sub.component';
import { Cdcus02dGenderwinComponent } from './cdcus02d-genderwin.component';
import { Cdcus02dGenderwinSubComponent } from './cdcus02d-genderwin-sub.component';
import { Cdcus02dMsgsflComponent } from './cdcus02d-msgsfl.component';
import { Cdcus02dMsgsflcComponent } from './cdcus02d-msgsflc.component';
import { SharedModule } from '../../shared.module';
import { MapRegistryService } from '../../services/map-registry.service';
import { Cdcus02dComponentsMap, Cdcus02dSubComponentsMap } from '.';

@NgModule({
    imports: [SharedModule],
    exports: [],
    declarations: [Cdcus02dScrn1Component,
		Cdcus02dAddwinComponent,
		Cdcus02dAddwinSubComponent,
		Cdcus02dGenderwinComponent,
		Cdcus02dGenderwinSubComponent,
		Cdcus02dMsgsflComponent,
		Cdcus02dMsgsflcComponent]
})
export class Cdcus02dModule {
  constructor(mapRegistryService: MapRegistryService) {
    mapRegistryService.registerModuleComponents(Cdcus02dComponentsMap);
    mapRegistryService.registerModuleSubComponents(Cdcus02dSubComponentsMap);
  }
}

