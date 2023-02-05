package edu.ntnu.idatt2001.sojohans.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Passage {
    private final String title;
    private final String content;
    private final List<Link> links;

    public Passage(String title, String content){
        if (title == null || content == null){
            throw new IllegalArgumentException("Title or content cannot be null!");
        }
        if (title.isEmpty() || content.isEmpty()){
            throw new IllegalArgumentException("Title of content cannot be empty!");
        }
        this.title = title;
        this.content = content;
        this.links = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public boolean addLink(Link link){
        if (link == null){
            throw new IllegalArgumentException("Link cannot be null!");
        }
        return links.add(link);
    }

    public List<Link> getLinks() {
        return links;
    }

    public boolean hasLinks(){
        return !links.isEmpty();
    }

    @Override
    public String toString() {
        return "Passage{\n" +
                "   title= '" + title + '\'' + "\n" +
                "   content= '" + content + '\'' + "\n" +
                "   links= " + links + "\n" +
                "}\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passage passage = (Passage) o;
        return Objects.equals(title, passage.title) && Objects.equals(content, passage.content)
                && Objects.equals(links, passage.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, content, links);
    }
}
