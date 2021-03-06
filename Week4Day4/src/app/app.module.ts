import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpModule } from '@angular/http';
import { UIRouterModule } from '@uirouter/angular';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';
import { FormsModule } from '@angular/forms';

import {AppComponent} from './app.component';
import {NavComponent} from './nav/nav.component';
import {CandyBarComponent} from './candy-bar/candy-bar.component';


@NgModule({
  imports: [
    BrowserModule,
    HttpModule,
    NgbModule.forRoot(),
    FormsModule
  ],
  declarations: [
    AppComponent,
    NavComponent,
    CandyBarComponent,
   ],
  providers: [

   ],
  bootstrap: [AppComponent]
})
export class AppModule { }
