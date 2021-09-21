package BlackJack;

import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AceRulesCheck {

    static Player player = new Player();
    static Stack<Card> deck;
    static Stack<Card> J = new Stack<>();
    static Stack<Card> A = new Stack<>();
    static Dealer dealer = new Dealer();


    @Test
    @DisplayName("Ace test")
    public void aceTest() {
        deck = DeckGenerator.getDeck();
        GameRules.blackJackGameRules(deck);

        GameRules.blackJackDealNewHand(deck, player.getHand(), dealer.getHand());
        Card b = new Card(2, "Hearts");
        Card t = new Card(10, "Diamonds");
        Card ACE = new Card(1, "Heart");

        J.add(b);
        J.add(ACE);

        A.add(t);
        A.add(ACE);

        player.setHand(J);
        dealer.setHand(A);


        assertEquals(11,GameRules.blackJackCheckValues(player.getHand()), "The players hand is the wrong value");
        assertEquals(13,GameRules.blackJackCheckValues(dealer.getHand()), "The Delaers hand is the wrong value");

    }
}
