import { Component, OnInit } from '@angular/core';
import { WeatherService } from '../weather.service';

@Component({
  selector: 'app-weather',
  templateUrl: './weather.component.html',
  styleUrls: []
})
export class WeatherComponent implements OnInit {
  
  weather: any;
  weatherSubscription: any;

  getWeather() {
    this.weatherSubscription = this.weatherService.getWeather()
    .subscribe(data => this.weather = data);
  }

  constructor(private weatherService: WeatherService) { }

  ngOnInit(): void {
    this.getWeather();
  }

  ngOnDestroy(): void {
    this.weatherSubscription.unsubscribe();
  }

}
