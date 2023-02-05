package edu.ntnu.idatt2001.sojohans.domain.goals;

import edu.ntnu.idatt2001.sojohans.domain.Player;

import java.util.List;

public class InventoryGoal implements Goal{
    private List<String> mandatoryItems;

    public InventoryGoal(List<String> mandatoryItems){
        if (mandatoryItems == null){
            throw new GoalException("InventoryGoal-MandatoryItems cannot be null!");
        }
        if (mandatoryItems.isEmpty()){
            throw new GoalException("InventoryGoal-MandatoryItems cannot be empty!");
        }
        this.mandatoryItems = mandatoryItems;
    }

    @Override
    public boolean isFulfilled(Player player) {
        return player.getInventory().containsAll(mandatoryItems);
    }
}
