package edu.ntnu.idatt2001.sojohans.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    void testThatGameConstructorHandlesExceptions(){
        Player player = null;
        Story story = new Story("Title", new Passage("Title","Content"));

        assertThrows(IllegalArgumentException.class, () ->
                new Game(player, story));
    }

    @Test
    void testThatBeginReturnsTheOpeningPassage(){
        Player player = new Player("Name", 100, 20, 20);
        Passage openingPassage = new Passage("Title", "Content");
        Story story = new Story("Title", openingPassage);
        Game game = new Game(player, story);

        assertEquals(openingPassage, game.begin());
    }

    @Test
    void testThatGoReturnsAPassage(){
        Player player = new Player("Name", 100, 20, 20);
        Passage openingPassage = new Passage("Title", "Content");
        Passage passage = new Passage("Another title", "More content");
        Story story = new Story("Title", openingPassage);
        Game game = new Game(player, story);
        game.getStory().addPassage(passage);

        assertEquals(passage, game.go(new Link(passage.getTitle(), passage.getTitle())));
    }
}