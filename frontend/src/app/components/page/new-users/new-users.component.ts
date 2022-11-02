import { Component, OnInit, Input } from '@angular/core';
import { Router } from '@angular/router';
import { UsersService } from 'src/app/service/users.service';

@Component({
  selector: 'app-new-users',
  templateUrl: './new-users.component.html',
  styleUrls: ['./new-users.component.css']
})
export class NewUsersComponent implements OnInit {

  @Input() userDetail = {
    name: '',
    email: '',
    phone: '',
    date: ''
  }

  constructor(
    public router : Router,
    public service: UsersService
  ) { }

  ngOnInit(): void {
  }

  inserUsert(form: any){
    if(form.valid){

      this.service.inserUsers(this.userDetail).subscribe(()=> {
        this.router.navigate(['users'])
      })
    }

    
  }


}
