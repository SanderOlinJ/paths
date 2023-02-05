package edu.ntnu.idatt2001.sojohans.domain.goals;

import edu.ntnu.idatt2001.sojohans.domain.Player;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InventoryGoalTest {

    @Test
    void testThatInventoryGoalReturnsExpectedResult(){
        Player player = new Player("Name", 100, 100, 100);
        List<String> mandatoryItems = new ArrayList<>();
        mandatoryItems.add("Item1");
        mandatoryItems.add("Item2");
        InventoryGoal inventoryGoal = new InventoryGoal(mandatoryItems);

        player.addToInventory("Item1");
        player.addToInventory("Item3");
        assertFalse(inventoryGoal.isFulfilled(player));
    }

    @Test
    void testThatInventoryGoalHandlesException(){
        List<String> mandatoryItems = new ArrayList<>();
        assertThrows(GoalException.class, () ->
                new InventoryGoal(mandatoryItems));
    }
}