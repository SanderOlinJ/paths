package edu.ntnu.idatt2001.sojohans.domain.goals;

import edu.ntnu.idatt2001.sojohans.domain.Player;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ScoreGoalTest {

    @Test
    void testThatScoreGoalReturnsExpectedResult(){
        Player player = new Player("Name", 100, 100, 100);
        ScoreGoal scoreGoal = new ScoreGoal(80);
        assertTrue(scoreGoal.isFulfilled(player));
    }
}