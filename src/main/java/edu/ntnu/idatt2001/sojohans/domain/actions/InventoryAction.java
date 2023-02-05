package edu.ntnu.idatt2001.sojohans.domain.actions;

import edu.ntnu.idatt2001.sojohans.domain.Player;

public class InventoryAction implements Action{
    private String item;

    public InventoryAction(String item){
        if (item == null){
            throw new ActionException("InventoryAction-Item cannot be null!");
        }
        if (item.isEmpty()){
            throw new ActionException("InventoryAction-Item cannot be empty!");
        }
        this.item = item;
    }

    @Override
    public void execute(Player player) {
        player.addToInventory(item);
    }
}
