package com.revature.pokedex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PokemonTest {
    @Test
    public void constructorTest(){
        String name = "Bulbausar";
        Pokemon pokemon = new Pokemon(name);
    }
    @Test
    public void nameTest(){
        Pokemon pokemon = new Pokemon("Squirtle");
        Assertions.assertEquals(pokemon.getName(), "Squirtle");
        pokemon = new Pokemon("Charmander");
        Assertions.assertEquals("Charmander", pokemon.getName());
    }
}
