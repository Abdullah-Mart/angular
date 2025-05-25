import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class WeatherService {

  constructor(private http: HttpClient) { }
  getWeather() {
    return this.http.get('https://api.openweathermap.org/data/2.5/weather?q=Utrecht,nl&APPID=47eb562d88e636ec448a2cafcb0ae1f9&units=metric&lang=en');
  }
}
