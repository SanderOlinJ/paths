package edu.ntnu.idatt2001.sojohans.domain.actions;

import edu.ntnu.idatt2001.sojohans.domain.Player;

public class GoldAction implements Action{
    private final int gold;

    public GoldAction(int gold){
        this.gold = gold;
    }

    @Override
    public void execute(Player player) {
        player.addGold(gold);
    }
}
