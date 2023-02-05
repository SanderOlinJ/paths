package edu.ntnu.idatt2001.sojohans.domain.actions;

import edu.ntnu.idatt2001.sojohans.domain.Player;

public class HealthAction implements Action{
    private int health;

    public HealthAction(int health){
        this.health = health;
    }

    @Override
    public void execute(Player player) {
        if (player.getHealth() + this.health <= 0){
            throw new IllegalArgumentException("Health-Action cannot give Player a health less than or equal to 0!");
        }
        player.addHealth(health);
    }
}
