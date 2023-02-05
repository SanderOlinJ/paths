package edu.ntnu.idatt2001.sojohans.domain.goals;

import edu.ntnu.idatt2001.sojohans.domain.Player;

public interface Goal {

    boolean isFulfilled(Player player);
}
