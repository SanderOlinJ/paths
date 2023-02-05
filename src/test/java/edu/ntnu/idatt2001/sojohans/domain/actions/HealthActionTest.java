package edu.ntnu.idatt2001.sojohans.domain.actions;

import edu.ntnu.idatt2001.sojohans.domain.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HealthActionTest {

    @Test
    void testThatHealthActionChangesPlayerHealth(){
        Player player = new Player("Name", 100, 100, 100);
        HealthAction healthAction = new HealthAction(50);
        healthAction.execute(player);

        assertEquals(150, player.getHealth());
    }

    @Test
    void testThatHealthActionHandlesException(){
        Player player = new Player("Name", 100, 100, 100);
        HealthAction healthAction = new HealthAction(-100);

        assertThrows(ActionException.class, () ->
                healthAction.execute(player));
    }
}