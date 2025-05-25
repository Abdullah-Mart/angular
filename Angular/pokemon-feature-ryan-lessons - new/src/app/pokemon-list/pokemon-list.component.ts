import { Component, OnInit } from '@angular/core';
import { PokemonServiceService } from '../pokemon-service.service';
import { RouterLink } from '@angular/router';
import { Ingredient } from '../pokemon-ingredients/pokemon-ingredients.component';

@Component({
  selector: 'app-pokemon-list',
  imports: [RouterLink],
  templateUrl: './pokemon-list.component.html',
  styleUrl: './pokemon-list.component.scss'
})
export class PokemonListComponent implements OnInit {
constructor(private pokemonService: PokemonServiceService) {}
pokemons: Ingredient[] = [];
pokemonSubscription: Ingredient[] = [];

  getAllPokemon() {
    this.pokemonSubscription = 
    this.pokemonService.getPokemon(0)
    .subscribe((data: any) => {this.pokemons = data})
    }
    
    ngOnInit(): void {
     this.getAllPokemon();
    }
  }
