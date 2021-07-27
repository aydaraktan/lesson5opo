package com.company;

public class MagicDoor {

    public Hero[] getHeroes(){
        Hero[] players = new Hero[4];

        Hero pl0 = new Hero();
        players[0] = pl0;

        Hero pl1 = new Hero();
        players[1] = pl1;

        Hero pl2 = new Hero();
        players[2] = pl2;

        Hero pl3 = new Hero();
        players[3] = pl3;

        return players;

    }


}