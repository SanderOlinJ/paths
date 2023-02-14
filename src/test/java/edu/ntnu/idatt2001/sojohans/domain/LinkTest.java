package edu.ntnu.idatt2001.sojohans.domain;

import edu.ntnu.idatt2001.sojohans.domain.actions.Action;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkTest {

    @Test
    void testThatLinkConstructorThrowsExceptionOnIllegalArgument(){
        String text = "text";
        String reference = null;

        assertThrows(IllegalArgumentException.class, () ->
            new Link(text, reference)
        );
    }

    @Test
    void testThatAddActionThrowsExceptionOnIllegalArugment(){
        Action action = null;
        Link link = new Link("Text", "Reference");
        assertThrows(IllegalArgumentException.class, () ->
                link.addAction(action));
    }

    @Test
    void testThatGetTextReturnsCorrectly(){
        Link link = new Link("Text", "Reference");
        assertEquals("Text", link.getText());
    }

    @Test
    void testThatGetReferenceReturnsCorrectly(){
        Link link = new Link("Text", "Reference");
        assertEquals("Reference", link.getReference());
    }
}