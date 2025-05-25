import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { FormsModule, NgForm } from '@angular/forms';
import { RouterLink } from '@angular/router';
import { Store } from '@ngrx/store';
import { Observable } from 'rxjs/internal/Observable';

@Component({
  selector: 'app-pokemon-add',
  imports: [FormsModule, CommonModule, RouterLink],
  templateUrl: './pokemon-add.component.html',
  styleUrls: ['./pokemon-add.component.scss']
})
export class PokemonAddComponent implements OnInit {
  count$: Observable<number>;
  pokemons: { name: string, ability: string }[] = [];
  // duplicatePokemon: boolean = false; 

  constructor(private store: Store<{ count: number }>) {
    this.count$ = store.select('count');
  }

  ngOnInit() {
    this.loadPokemons();
  }

  submitForm(form: NgForm) {
    if (form.form.invalid) {
      return; 
    }

    const newPokemon = {
      name: form.value.name,
      ability: form.value.ability
    };

  
    const duplicate = this.pokemons.some(pokemon => pokemon.name === newPokemon.name && pokemon.ability === newPokemon.ability);
    if (duplicate) {
      this.duplicatePokemon = true; 
      return;
    }

    this.pokemons.push(newPokemon); 
    this.savePokemons();
    form.reset(); 
    this.duplicatePokemon = false; 
  }

  savePokemons() {
    localStorage.setItem('pokemons', JSON.stringify(this.pokemons)); 
  }

  loadPokemons() {
    const savedPokemons = localStorage.getItem('pokemons');
    if (savedPokemons) {
      this.pokemons = JSON.parse(savedPokemons); 
    }
  }

  checkValid(formdata: NgForm, inputString: string) {
    if (formdata.form.controls[inputString].invalid && formdata.form.controls[inputString].touched) {
      return true;
    }
    return false;
  }
}
