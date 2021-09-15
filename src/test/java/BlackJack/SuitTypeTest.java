package BlackJack;

import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SuitTypeTest {
    Card testCard = new Card (0, "Hearts");

    @Test
    @DisplayName("Fourth Test")
    public void testSuitType()
    {
        testCard.setSuit("Hearts");
        assertEquals("Hearts", testCard.getSuit(), "This cards is not a heart");
    }
}

