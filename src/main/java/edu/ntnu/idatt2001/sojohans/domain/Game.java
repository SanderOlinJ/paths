package edu.ntnu.idatt2001.sojohans.domain;

import edu.ntnu.idatt2001.sojohans.domain.goals.Goal;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private final Player player;
    private final Story story;
    private final List<Goal> goals;

    public Game(Player player, Story story, List<Goal> goals){
        if (player == null || story == null || goals == null){
            throw new IllegalArgumentException("Game-Player, Game-Story or Game-Goals cannot be null!");
        }
        this.player = player;
        this.story = story;
        this.goals = new ArrayList<>();
        this.goals.addAll(goals);
    }

    public Player getPlayer() {
        return player;
    }

    public Story getStory() {
        return story;
    }

    public List<Goal> getGoals() {
        return goals;
    }

    public Passage begin(){
        return story.getOpeningPassage();
    }

    public Passage go(Link link){
        if (link == null){
            throw new IllegalArgumentException("Game-Link cannot be null!");
        }
        return story.getPassage(link);
    }
}
