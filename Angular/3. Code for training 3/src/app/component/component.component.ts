import { Component, OnInit } from '@angular/core';
import { MockService } from '../mock.service';

@Component({
  selector: 'app-component',
  templateUrl: './component.component.html'
})
export class ComponentComponent implements OnInit {
  mock: any;
  getMock(): void {
    this.mock = this.mockService.getMock();
  }
  
  constructor(private mockService: MockService) {}

  ngOnInit(): void {
    this.getMock();
  }
}
