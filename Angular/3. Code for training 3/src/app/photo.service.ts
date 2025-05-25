import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class PhotoService {

  constructor(private http: HttpClient) { }
  getPhoto() {
    return this.http.get('https://jsonplaceholder.typicode.com/photos');
  }
}
