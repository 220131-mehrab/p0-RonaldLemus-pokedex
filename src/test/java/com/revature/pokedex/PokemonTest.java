package com.revature.pokedex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PokemonTest {
    @Test
    public void constructorTest(){
        String name = "Bulbausar";
        Pokemon pokemon = new Pokemon(name);
        pokemon = new Pokemon(2,"Ivysaur", "Grass","Poison");
    }

    @Test
    public void builderTest(){
        Pokemon actual = Pokemon.of().id(1).name("Bulbasaur").type1("Grass").type2("Poison");
        Assertions.assertEquals("Bulbasaur", actual.getName());
        actual = Pokemon.of().type2("Poison").name("Ivysaur").id(2);
    }

    @Test
    public void nameTest(){
        Pokemon pokemon = new Pokemon("Squirtle");
        Assertions.assertEquals(pokemon.getName(), "Squirtle");
        pokemon = new Pokemon("Charmander");
        Assertions.assertEquals("Charmander", pokemon.getName());
    }
}
