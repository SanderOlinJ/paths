package edu.ntnu.idatt2001.sojohans.domain;

import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class LinkTest {

    @Test
    void testThatConstructorThrowsExceptionOnIllegalArgument(){
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
}