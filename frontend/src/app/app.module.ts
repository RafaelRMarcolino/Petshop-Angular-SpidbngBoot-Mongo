import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './components/home/home.component';
import { UsersNewComponent } from './components/page/users-new/users-new.component';
import { UsersEditComponent } from './components/page/users-edit/users-edit.component';
import { UsersListComponent } from './components/page/users-list/users-list.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    UsersNewComponent,
    UsersEditComponent,
    UsersListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
