package edu.ntnu.idatt2001.sojohans.domain.actions;

import edu.ntnu.idatt2001.sojohans.domain.Player;

public class ScoreAction implements Action{
    private final int points;

    public ScoreAction(int points){
        this.points = points;
    }

    @Override
    public void execute(Player player) {
        player.addScore(points);
    }
}
