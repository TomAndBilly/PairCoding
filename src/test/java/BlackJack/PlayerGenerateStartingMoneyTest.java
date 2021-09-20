package BlackJack;

import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PlayerGenerateStartingMoneyTest {

     static Player player = new Player();
   static Stack<Card> deck;
   static Dealer dealer = new Dealer();


    @Test
    @DisplayName("PlayerGenerated starting money test")
    public void PlayerGenerateStartingMoneyTest()
    {
            deck = DeckGenerator.getDeck();
        GameRules.blackJackGameRules(deck);
        GameRules.blackJackDealNewHand(deck, player.getHand(), dealer.getHand());

        assertEquals(500,player.getStartingMoney(), "The player has the wrong amount of money");
        assertEquals(500,dealer.getStartingMoney(), "The Dealer has the wrong amount of money");

    }


}
