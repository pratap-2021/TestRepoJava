package org.example;

public class Chess extends Game{
    String getName() {
        String name = "Chess";
        return name;
    }

    // play method should print "Kill the enemy king."
    void play() {
        System.out.println("Kill the enemy king");
    }
}
