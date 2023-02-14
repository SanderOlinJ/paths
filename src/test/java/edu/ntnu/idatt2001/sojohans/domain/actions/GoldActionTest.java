package edu.ntnu.idatt2001.sojohans.domain.actions;

import edu.ntnu.idatt2001.sojohans.domain.Player;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GoldActionTest {

    @Test
    void testThatGoldActionChangesPlayerGold(){
        Player player = new Player("Name", 100, 100, 100);
        GoldAction goldAction = new GoldAction(40);
        goldAction.execute(player);

        assertEquals(140, player.getGold());
    }

}