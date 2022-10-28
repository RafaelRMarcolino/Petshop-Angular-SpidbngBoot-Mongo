import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { UsersNewComponent } from './components/page/users-new/users-new.component';
import { UsersListComponent } from './components/page/users-list/users-list.component';
import { UsersEditComponent } from './components/page/users-edit/users-edit.component';

const routes: Routes = [
  {path: '', redirectTo: 'home',  pathMatch: 'full'},
  {path: 'home', component: HomeComponent},
  {path:  'users/newusers', component: UsersNewComponent},
  {path: 'edit-users', component: UsersEditComponent},
  {path: 'users', component: UsersListComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
