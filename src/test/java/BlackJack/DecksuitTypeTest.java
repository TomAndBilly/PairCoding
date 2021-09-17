package BlackJack;

import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class DecksuitTypeTest {
    Deck deck = new Deck ();


    @Test
    @DisplayName("Another Test")
    public void TestDeckSuit()
    {
 //deck.setSuitType(String[] "Hearts");
       // deck.suitType = "Hearts";

        String testInput [] = {"Test", "Test2", "Test3", "Test4"};

        String actualyinput [] = deck.getSuitType();

        deck.setSuitType(testInput);


       assertNotEquals(actualyinput, deck.getSuitType(),  "Test Failed: Deck Suit was not set ");

    }
}

