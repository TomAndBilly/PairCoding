package BlackJack;
import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class NewHandTest {
    static Stack<Card> deck;
    static Player player = new Player();
    static Dealer dealer = new Dealer();

    @Test
    @DisplayName("New hand test")
    public void NewHandTest() {
        deck = DeckGenerator.getDeck();
        GameRules.blackJackGameRules(deck);

        GameRules.blackJackDealNewHand(deck, player.getHand(), dealer.getHand());

       assertEquals(deck.size(),48, "The deck size is hte wrong value");


    }
}
