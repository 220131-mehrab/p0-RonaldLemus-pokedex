package com.revature.pokedex;

import java.util.ArrayList;
import java.util.List;

public class InMemoryDexRepository {
    private List<Pokemon> pocketMonsters;

    public InMemoryDexRepository(){
        pocketMonsters = new ArrayList<>();
        pocketMonsters.add(Pokemon.of().id(1).name("Bulbasaur").type1("Grass").type2("Poison"));
    }

}
