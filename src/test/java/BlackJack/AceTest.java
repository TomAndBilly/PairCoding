package BlackJack;

import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
public class AceTest {

    @Test
    @DisplayName("Ace Check Test")
    void blackJackCheckValuesAreAboveThresholdTest(){
        Stack<Card> c = new Stack<>();
        c = DeckGenerator.getDeck();
        Player p = new Player();
        GameRules.blackJackAceRules(p.getHand());
        for (Card t: p.getHand()){
            assertNotEquals(11,t.getCardValue(),"one of these cards is 11");
        }
    }
}
