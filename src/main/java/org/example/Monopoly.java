package org.example;

public class Monopoly extends Game{
    //give "Chess" name to game

    //give "Monopoly" name to game
    String getName() {
        String name = "Monopoly";
        return name;
    }

    // play method should print "Buy all property."
    void play() {
        System.out.println("Buy all property");
    }
}
