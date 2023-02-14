package edu.ntnu.idatt2001.sojohans.domain.goals;

import edu.ntnu.idatt2001.sojohans.domain.Player;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HealthGoalTest {

    @Test
    void testThatHealthGoalReturnsExpectedResult(){
        Player player = new Player("Name", 100, 100, 100);
        HealthGoal healthGoal = new HealthGoal(120);
        assertFalse(healthGoal.isFulfilled(player));
    }

    @Test
    void testThatHealthGoalHandlesException(){
        Player player = new Player("Name", 100, 100, 100);
        assertThrows(GoalException.class, () ->
                new HealthGoal(-2));
    }

}