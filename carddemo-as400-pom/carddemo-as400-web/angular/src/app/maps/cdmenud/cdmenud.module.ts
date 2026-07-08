import { NgModule } from '@angular/core';
import { CdmenudCardmenuComponent } from './cdmenud-cardmenu.component';
import { SharedModule } from '../../shared.module';
import { MapRegistryService } from '../../services/map-registry.service';
import { CdmenudComponentsMap, CdmenudSubComponentsMap } from '.';

@NgModule({
    imports: [SharedModule],
    exports: [],
    declarations: [CdmenudCardmenuComponent]
})
export class CdmenudModule {
  constructor(mapRegistryService: MapRegistryService) {
    mapRegistryService.registerModuleComponents(CdmenudComponentsMap);
    mapRegistryService.registerModuleSubComponents(CdmenudSubComponentsMap);
  }
}

