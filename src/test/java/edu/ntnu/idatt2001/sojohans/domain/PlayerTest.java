package edu.ntnu.idatt2001.sojohans.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void testThatPlayerConstructorHandlesExceptions(){
        int health = -1;
        assertThrows(IllegalArgumentException.class, () ->
                new Player("Name",health, 10, 30));
    }

    @Test
    void testThatAddHealthCannotSetNegativeValue(){
        Player player = new Player("Player", 100, 4, 2000);
        assertThrows(IllegalArgumentException.class, () ->
                player.addHealth(-101));
    }

    @Test
    void testThatItemIsAddedToInventory(){
        Player player = new Player("Player", 100, 50, 1000);
        player.addToInventory("Item");

        assertEquals(1, player.getInventory().size());
    }
}