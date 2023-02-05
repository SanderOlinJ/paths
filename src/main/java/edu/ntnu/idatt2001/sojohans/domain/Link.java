package edu.ntnu.idatt2001.sojohans.domain;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Link {
    private String text;
    private String reference;
    private List<Action> actions;

    public Link(String text, String reference){
        if (text == null || reference == null){
            throw new IllegalArgumentException("Text or reference cannot be null");
        }
        this.text = text;
        this.reference = reference;
        this.actions = new ArrayList<>();
    }

    public String getText() {
        return text;
    }

    public String getReference() {
        return reference;
    }

    public void addAction(Action action){
        if (action == null){
            throw new IllegalArgumentException("Action cannot be null!");
        }
        actions.add(action);
    }

    public List<Action> getActions() {
        return actions;
    }

    @Override
    public String toString() {
        return "Link{ \n" +
                "text= '" + text + '\'' +
                ", reference= '" + reference + '\'' +
                ", actions= " + actions +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Link link = (Link) o;
        return Objects.equals(text, link.text) && Objects.equals(reference, link.reference)
                && Objects.equals(actions, link.actions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, reference, actions);
    }
}
