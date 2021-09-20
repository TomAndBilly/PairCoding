package BlackJack;

import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HitMeTest {
    static Stack<Card> deck;
    static Player player = new Player();

    @Test
    @DisplayName("Hit me baby one more time Test")
    public void HitMeTest() {
        deck = DeckGenerator.getDeck();
        GameRules.blackJackGameRules(deck);
        GameRules.blackJackHitMe(deck, player.getHand());

        assertEquals(deck.size(),51, "The deck size is hte wrong value");
        assertEquals(deck.size(),51, "The deck size is hte wrong value");



    }
}

