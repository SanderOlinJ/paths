package edu.ntnu.idatt2001.sojohans.domain.actions;

import edu.ntnu.idatt2001.sojohans.domain.Player;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InventoryActionTest {

    @Test
    void testThatInventoryActionChangesPlayerScore(){
        Player player = new Player("Name", 100, 100, 100);
        InventoryAction inventoryAction = new InventoryAction("New item");
        inventoryAction.execute(player);

        assertEquals("New item", player.getInventory().get(0));
    }

    @Test
    void testThatInventoryActionConstructorHandlesException(){
        assertThrows(ActionException.class, () ->
                new InventoryAction(""));
    }
}