package BlackJack;

import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCardValue {

    Card testCard = new Card(0,"Hearts");

    @Test
    @DisplayName("Third Test")
    public void testCardValue()
    {
        testCard.setCardValue(2);
        assertEquals(2, testCard.getCardValue(), "This cards has the wrong value");
    }
}
