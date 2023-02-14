package edu.ntnu.idatt2001.sojohans.domain;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class PassageTest {

    @Test
    void testThatPassageConstructorHandlesExceptions(){
        String title = null;
        String content = "Empty";

        assertThrows(IllegalArgumentException.class, () ->
                new Passage(title, content));
    }
    @Test
    void testThatLinksAreAddedToPassage(){
        Passage passage = new Passage("Title", "Content");
        Link link = new Link("Text", "Reference");
        passage.addLink(link);

        List<Link> copyOfLinks = passage.getLinks();
        assertTrue(copyOfLinks.contains(link));
    }

    @Test
    void testThatHasUnitsReturnsCorrectly(){
        Passage passage = new Passage("Title", "Content");
        Link link = new Link("Text", "Reference");
        passage.addLink(link);

        assertTrue(passage.hasLinks());
    }

    @Test
    void testThatGetContentReturnsCorrectly(){
        Passage passage = new Passage("Title", "Content");
        assertEquals("Content", passage.getContent());
    }
}