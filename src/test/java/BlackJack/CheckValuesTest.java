package BlackJack;

import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Stack;

public class CheckValuesTest {

    static Player player = new Player();
    static Stack<Card> deck;
    static Stack<Card> J = new Stack<>();
    static Dealer dealer = new Dealer();

    @Test
    @DisplayName("Check Values Test")
    public void CheckValuesTest() {
        deck = DeckGenerator.getDeck();
        GameRules.blackJackGameRules(deck);
        GameRules.blackJackDealNewHand(deck, player.getHand(), dealer.getHand());

        Card b = new Card (2,"Hearts");
        Card t = new Card (10,"Diamonds");

        J.add(b);
        J.add(t);

        player.setHand(J);

        assertEquals(GameRules.blackJackCheckValues(player.getHand()),12, "The players hand is hte wrong value");

    }
}
