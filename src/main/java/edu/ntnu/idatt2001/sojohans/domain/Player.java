package edu.ntnu.idatt2001.sojohans.domain;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private final String name;
    private int health;
    private int score;
    private int gold;
    private final List<String> inventory;

    public Player(String name, int health, int score, int gold){
        if (name == null){
            throw new IllegalArgumentException("Player-Name cannot be null!");
        }
        if (name.isEmpty()){
            throw new IllegalArgumentException("Player-Name cannot be empty!");
        }
        if (health < 0){
            throw new IllegalArgumentException("Player-Health cannot be less than 0");
        }
        this.name = name;
        this.health = health;
        this.score = score;
        this.gold = gold;
        this.inventory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addHealth(int health){
        if (this.health + health < 0){
            throw new IllegalArgumentException("Player-Health cannot be less than 0");
        }
        this.health += health;
    }

    public int getHealth() {
        return health;
    }

    public void addScore(int score){
        this.score += score;
    }

    public int getScore() {
        return score;
    }

    public void addGold(int gold){
        this.gold += gold;
    }

    public int getGold() {
        return gold;
    }

    public void addToInventory(String item){
        if (item == null){
            throw new IllegalArgumentException("Player-Item cannot be null!");
        }
        if (item.isEmpty()){
            throw new IllegalArgumentException("Player-Item cannot be empty!");
        }
        inventory.add(item);
    }

    public List<String> getInventory() {
        return inventory;
    }
}
