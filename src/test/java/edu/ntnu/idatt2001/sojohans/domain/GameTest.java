package edu.ntnu.idatt2001.sojohans.domain;

import edu.ntnu.idatt2001.sojohans.domain.goals.Goal;
import edu.ntnu.idatt2001.sojohans.domain.goals.ScoreGoal;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    void testThatGameConstructorHandlesExceptions(){
        Player player = null;
        Story story = new Story("Title", new Passage("Title","Content"));
        List<Goal> goals = new ArrayList<>();
        assertThrows(IllegalArgumentException.class, () ->
                new Game(player, story, goals));
    }

    @Test
    void testThatBeginReturnsTheOpeningPassage(){
        Player player = new Player("Name", 100, 20, 20);
        Passage openingPassage = new Passage("Title", "Content");
        Story story = new Story("Title", openingPassage);
        List<Goal> goals = new ArrayList<>();
        goals.add(new ScoreGoal(10));
        Game game = new Game(player, story, goals);

        assertEquals(openingPassage, game.begin());
    }

    @Test
    void testThatGoReturnsAPassage(){
        Player player = new Player("Name", 100, 20, 20);
        Passage openingPassage = new Passage("Title", "Content");
        Passage passage = new Passage("Another title", "More content");
        Story story = new Story("Title", openingPassage);
        List<Goal> goals = new ArrayList<>();
        goals.add(new ScoreGoal(10));
        Game game = new Game(player, story, goals);
        game.getStory().addPassage(passage);

        assertEquals(passage, game.go(new Link(passage.getTitle(), passage.getTitle())));
    }
}