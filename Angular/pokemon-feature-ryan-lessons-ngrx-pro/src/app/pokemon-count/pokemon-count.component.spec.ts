import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PokemonCountComponent } from './pokemon-count.component';
import { createAction, provideState, provideStore, Store } from '@ngrx/store';
import { counterReducer } from '../ngrx/reducers/counter.reducer';
import { CommonModule } from '@angular/common';
import { provideRouter, RouterLink } from '@angular/router';
import { routes } from '../app.routes';
import { MockStore, provideMockStore } from '@ngrx/store/testing';
import { increment } from '../ngrx/actions/counter.action';

describe('PokemonCountComponent', () => {
  let component: PokemonCountComponent;
  let fixture: ComponentFixture<PokemonCountComponent>;
  const initialState = { count: 0 };
  let store: MockStore
//  let spyStore: jasmine.SpyObj<Store>;
  beforeEach(async () => {
    // spyStore = jasmine.createSpyObj('Store', ['dispatch', 'select'])
    
    await TestBed.configureTestingModule({
      imports: [PokemonCountComponent, CommonModule, RouterLink],
      providers: [
        provideRouter(routes), 
        provideMockStore({ initialState }),
      ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PokemonCountComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
    store = TestBed.inject(MockStore);
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('should have a count of 0', () => {
      const dispatchSpy = spyOn(store, 'dispatch');

      component.increment();

      expect(dispatchSpy).toHaveBeenCalledWith(increment());
  });

});
