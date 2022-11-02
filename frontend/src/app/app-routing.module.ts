import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { UsersListComponent } from './components/page/users-list/users-list.component';
import { UsersEditComponent } from './components/page/users-edit/users-edit.component';
import { NewUsersComponent } from './components/page/new-users/new-users.component';

const routes: Routes = [
  {path: '', redirectTo: 'home',  pathMatch: 'full'},
  {path: 'home', component: HomeComponent},
  {path: 'edit-users', component: UsersEditComponent},
  {path: 'users', component: UsersListComponent},
  {path: 'new-users', component: NewUsersComponent},


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
