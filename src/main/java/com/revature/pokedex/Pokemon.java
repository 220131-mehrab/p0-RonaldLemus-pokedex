package com.revature.pokedex;

public class Pokemon {
    private String name;
    private int dexId;
    private String type1;
    private String type2;

    public Pokemon(){}

    public Pokemon(String name){
        this(-1, name, "", "");
    }

    public Pokemon(int dexId, String name, String type1, String type2) {
        this.dexId = dexId;
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
    }

    public static Pokemon of(){
        return new Pokemon();
    }

    public Pokemon id(int id){
        this.dexId = id;
        return this;
    }

    public Pokemon name(String name){
        this.name = name;
        return this;
    }

    public Pokemon type1(String type1){
        this.type1 =type1;
        return this;
    }

    public Pokemon type2(String type2){
        this.type2 = type2;
        return this;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString(){
        return this.name;
    }
}
