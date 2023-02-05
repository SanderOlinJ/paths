package edu.ntnu.idatt2001.sojohans.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoryTest {

    @Test
    void testThatStoryConstructorHandlesExceptions(){
        Passage passage = null;
        assertThrows(IllegalArgumentException.class, () ->
                new Story("Title", passage));
    }

    @Test
    void testThatPassageIsAddedAndRetrieved(){
        Passage passage = new Passage("Title", "Content");
        Story story = new Story("Title", passage);


        assertEquals(passage, story.getPassage(new Link("Title", "Title")));
    }

    @Test
    void testThatAllPassageValuesAreRetrieved(){
        Passage openingPassage = new Passage("Title", "Content");
        Story story = new Story("Title", openingPassage);
        Passage passage = new Passage("Another title", "More content");
        story.addPassage(passage);

        assertEquals(2, story.getPassages().size());
    }
}