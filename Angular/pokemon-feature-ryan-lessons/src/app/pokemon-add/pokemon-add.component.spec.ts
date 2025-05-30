import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PokemonAddComponent } from './pokemon-add.component';

describe('PokemonServingsComponent', () => {
  let component: PokemonAddComponent;
  let fixture: ComponentFixture<PokemonAddComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [PokemonAddComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PokemonAddComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
