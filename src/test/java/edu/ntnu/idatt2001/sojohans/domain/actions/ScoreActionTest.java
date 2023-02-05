package edu.ntnu.idatt2001.sojohans.domain.actions;

import edu.ntnu.idatt2001.sojohans.domain.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScoreActionTest {

    @Test
    void testThatScoreActionChangesPlayerScore(){
        Player player = new Player("Name", 100, 100, 100);
        ScoreAction scoreAction = new ScoreAction(20);
        scoreAction.execute(player);

        assertEquals(120, player.getScore());
    }
}