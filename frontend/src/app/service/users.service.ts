import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Observable, throwError } from 'rxjs';

import { retry, catchError } from 'rxjs';

import { Users } from '../model/Users';


@Injectable({
  providedIn: 'root'
})
export class UsersService {

  constructor(private http:HttpClient) { }

  apiUrl: String = 'http://localhost:8080';

  autorizacao = {
    headers : new HttpHeaders({
      'Content-Type': 'application/json'
    })
  }

  getAllusers(): Observable<Users>{

   return this.http.get<Users>(this.apiUrl+'/api/usuarios').pipe(retry(1), catchError(this.tratarErro));
  }

  getByIdUsers(id: any): Observable<Users>{

    return this.http.get<Users>(this.apiUrl +'/api/usuarios/' + id).pipe(retry(1), catchError(this.tratarErro));
  }

  inserUsers(obj: any):Observable<Users>{
    return this.http.post<Users>(this.apiUrl + '/api/usuarios', JSON.stringify(obj), this.autorizacao)
    .pipe(retry(1), catchError(this.tratarErro));
  }


  updateUsers(id: any , obj: any){
    return this.http.put<Users>(this.apiUrl+'/api/usuarios/' + id, JSON.stringify(obj), this.autorizacao)
    .pipe(retry(1), catchError(this.tratarErro));
  }

  deleteUsers(id: any){
    return this.http.delete<Users>(this.apiUrl+'/api/usuarios/' + id).pipe(retry(1), catchError(this.tratarErro));
  }


  tratarErro(erro: any){

    let menssageError = ''
    if(erro.error instanceof ErrorEvent){
          let menssageError = ''
    }else{
      menssageError = `Codigo do erro ${erro.menssagem}`
    }
    alert(menssageError);

    return throwError(() => menssageError)
  }
  
}
