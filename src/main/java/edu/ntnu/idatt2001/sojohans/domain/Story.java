package edu.ntnu.idatt2001.sojohans.domain;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Story {
    private final String title;
    private final Map<Link, Passage> passages;
    private final Passage openingPassage;

    public Story(String title, Passage openingPassage){
        if (title == null || openingPassage == null){
            throw new IllegalArgumentException("Title or openingPassage cannot be null!");
        }
        this.title = title;
        this.openingPassage = openingPassage;
        this.passages = new HashMap<>();
        addPassage(openingPassage);
    }

    public String getTitle() {
        return title;
    }

    public Passage getOpeningPassage() {
        return openingPassage;
    }

    public void addPassage(Passage passage){
        if (passage == null){
            throw new IllegalArgumentException("Passage cannot be null!");
        }
        passages.put(new Link(passage.getTitle(), passage.getTitle()), passage);
    }

    public Passage getPassage(Link link){
        if (link == null){
            throw new IllegalArgumentException("Link cannot be null");
        }
        return passages.get(link);
    }

    public Collection<Passage> getPassages() {
        return passages.values();
    }
}
