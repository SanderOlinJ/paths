package edu.ntnu.idatt2001.sojohans.domain.actions;

import edu.ntnu.idatt2001.sojohans.domain.Player;

public class HealthAction implements Action{
    private final int health;

    public HealthAction(int health){
        this.health = health;
    }

    @Override
    public void execute(Player player) {
        if (player.getHealth() + this.health < 0){
            throw new ActionException("Health-Action cannot give Player a health less than 0!");
        }
        player.addHealth(health);
    }
}
