package dssc.assignment.cribbage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ParseHandTest {

    @Test
    void parseOneCard() {
        Card card = CardParser.parseCard("5H");
        assertAll(
                () -> assertEquals(Rank.FIVE, card.rank()),
                () -> assertEquals(Suite.HEART, card.suite())
        );
    }
}
