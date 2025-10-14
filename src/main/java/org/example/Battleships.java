package org.example;

public class Battleships extends Game{
    //give "Battleships" name to game
    String getName() {
        String name = "Battleships";
        return name;
    }

    // play method should print "Sink all ships."
    void play() {
        System.out.println("Sink all ships");
    }
}
