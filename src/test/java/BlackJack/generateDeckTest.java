package BlackJack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class generateDeckTest {
    @Test
    @DisplayName("Test to check deck generation")
    void generateDeckTest(){
        Stack<Card> c;
        Stack<Card> d;
        c = DeckGenerator.getDeck();
        d = DeckGenerator.getDeck();
        assertNotEquals(d,c, "test failed for shuffling of deck");
    }
}
