package edu.ntnu.idatt2001.sojohans.domain;

import edu.ntnu.idatt2001.sojohans.domain.actions.Action;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Link {
    private final String text;
    private final String reference;
    private final List<Action> actions;

    public Link(String text, String reference){
            if (text == null || reference == null){
                throw new IllegalArgumentException("Link-Text or Link-Reference cannot be null!");
            }
            if (text.isEmpty() || reference.isEmpty()){
            throw new IllegalArgumentException("Link-Text or Link-reference cannot be empty!");
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
            throw new IllegalArgumentException("Link-Action cannot be null!");
        }
        actions.add(action);
    }

    public List<Action> getActions() {
        return actions;
    }

    @Override
    public String toString() {
        return "Link{ \n" +
                "   text= '" + text + '\'' + "\n" +
                "   reference= '" + reference + '\'' + "\n" +
                "   actions= " + actions + "\n" +
                "}\n";
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
