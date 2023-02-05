package edu.ntnu.idatt2001.sojohans.domain.goals;

import edu.ntnu.idatt2001.sojohans.domain.Player;

public class ScoreGoal implements Goal{
    private final int minimumPoints;

    public ScoreGoal(int minimumPoints){
        this.minimumPoints = minimumPoints;
    }

    @Override
    public boolean isFulfilled(Player player) {
        return player.getScore() >= minimumPoints;
    }
}
