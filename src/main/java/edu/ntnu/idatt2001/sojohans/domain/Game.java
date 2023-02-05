package edu.ntnu.idatt2001.sojohans.domain;

public class Game {
    private Player player;
    private Story story;

    public Game(Player player, Story story){
        if (player == null || story == null){
            throw new IllegalArgumentException("Game-Player or Game-Story cannot be null!");
        }

        this.player = player;
        this.story = story;
    }

    public Player getPlayer() {
        return player;
    }

    public Story getStory() {
        return story;
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
