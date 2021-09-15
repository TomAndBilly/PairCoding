package BlackJack;

import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DeckValueTest {
    Deck deck = new Deck ();

    @Test
    @DisplayName("First Test")
    public void testGetCardValue()
    {
        assertEquals(Deck.getAmount(), 52, "Test Failed: Deck Amount doesn't equal 52");

    }

}
