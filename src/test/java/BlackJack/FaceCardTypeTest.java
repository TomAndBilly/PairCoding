package BlackJack;

import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FaceCardTypeTest {

    Card testCard = new Card (11, "Hearts");

    @Test
    @DisplayName("Third Test")
    public void testFaceCard()
    {
        testCard.setFaceCard(testCard.isFaceCard());
        testCard.setFaceCardType("King");
        assertEquals(testCard.getFaceCardType(), "King", "This cards is not a face card");
    }
}
