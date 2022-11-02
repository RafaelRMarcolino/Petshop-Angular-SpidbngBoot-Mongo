import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { HttpClientModule } from '@angular/common/http'
import { FormsModule } from '@angular/forms';

// service
import { UsersService } from './service/users.service';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './components/home/home.component';
import { UsersEditComponent } from './components/page/users-edit/users-edit.component';
import { UsersListComponent } from './components/page/users-list/users-list.component';
import { NavComponent } from './components/nav/nav.component';
import { FooterComponent } from './components/footer/footer.component';
import { NewUsersComponent } from './components/page/new-users/new-users.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    UsersEditComponent,
    UsersListComponent,
    NavComponent,
    FooterComponent,
    NewUsersComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule


  ],
  providers: [UsersService],
  bootstrap: [AppComponent]
})
export class AppModule { }
