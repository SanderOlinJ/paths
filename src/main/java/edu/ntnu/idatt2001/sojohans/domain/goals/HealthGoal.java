package edu.ntnu.idatt2001.sojohans.domain.goals;

import edu.ntnu.idatt2001.sojohans.domain.Player;

public class HealthGoal implements Goal{
    private int minimumHealth;

    public HealthGoal(int minimumHealth){
        if (minimumHealth < 0){
            throw new GoalException("HealthGoal-MinimumHealth cannot be less than 0");
        }
        this.minimumHealth = minimumHealth;
    }

    @Override
    public boolean isFulfilled(Player player) {
        return  player.getHealth() >= minimumHealth;
    }
}
