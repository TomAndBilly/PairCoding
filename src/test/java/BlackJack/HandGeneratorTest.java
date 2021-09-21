//package BlackJack;
//
//import org.junit.jupiter.api.DisplayName;
//import org.testng.annotations.Test;
//import static org.junit.jupiter.api.Assertions.assertSame;
//import static org.junit.jupiter.api.Assertions.assertNotEquals;
//
//import java.util.Stack;
//
//public class HandGeneratorTest {
//
//        static Stack<Card> deck;
//
//    static Player player = new Player();
//    static Dealer dealer = new Dealer();
//    Stack<Card> test = new Stack<>();
//    Stack<Card> testAgain = new Stack<>();
//
//    Card b = new Card (2,"Hearts");
//    Card t = new Card (10,"Diamonds");
//
//    Card bt = new Card (4,"Hearts");
//    Card tb = new Card (6,"Diamonds");
//
//
//
//    @Test
//    @DisplayName("PlayerGenerated See hand test ")
//    public void PlayerGenerateHand(){
//         deck = DeckGenerator.getDeck();
//        GameRules.blackJackGameRules(deck);
//        //GameRules.blackJackDealNewHand(deck, player.getHand(), dealer.getHand());
//       test.add(t);
//       testAgain.add(b);
//       test.add(bt);
//       testAgain.add(tb);
//       player.setHand(test);
//       dealer.setHand(testAgain);
//
//       //player.hand.add(t);
//
//       //System.out.println(player.getHand());
//
//        assertNotEquals(player.getHand(),dealer.getHand(), "The dealers hand and players hand are  the same");
//
//
//    }
//}