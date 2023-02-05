package edu.ntnu.idatt2001.sojohans.domain.goals;

import edu.ntnu.idatt2001.sojohans.domain.Player;

public class GoldGoal implements Goal{
    private int minimumGold;

    public GoldGoal(int minimumGold){
        this.minimumGold = minimumGold;
    }

    @Override
    public boolean isFulfilled(Player player) {
        return player.getGold() >= this.minimumGold;
    }
}
