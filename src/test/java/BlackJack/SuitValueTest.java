package BlackJack;

import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SuitValueTest {
    Deck deck = new Deck ();

    @Test
    @DisplayName("Second Test")
    public void testGetSuitAmount()
    {
        assertEquals(Deck.getAmountInEachSuit(), 13, "There are not 13 cards in this suit");

    }
}
