package edu.ntnu.idatt2001.sojohans.domain.goals;

import edu.ntnu.idatt2001.sojohans.domain.Player;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GoldGoalTest {

    @Test
    void testThatGoldGoalReturnsExpectedResult(){
        Player player = new Player("Name", 100, 100, 100);
        GoldGoal goldGoal = new GoldGoal(50);
        assertTrue(goldGoal.isFulfilled(player));
    }

}