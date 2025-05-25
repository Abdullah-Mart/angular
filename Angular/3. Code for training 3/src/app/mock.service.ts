import { Injectable } from '@angular/core';
import { MOCK } from './mock_data';

@Injectable({
  providedIn: 'root'
})
export class MockService {

  constructor() { }
  getMock() {
    return MOCK;
  }
}
