package BlackJack;

import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FaceCardCheckTest {

    Card testCard = new Card (11, "Hearts");

    @org.junit.Test
    @Test
    @DisplayName("Fith Test")
    public void testSuitType()
    {
        testCard.setFaceCard(true);
        assertEquals(true, testCard.isFaceCard(),  "This cards is not a face card");
    }
}
