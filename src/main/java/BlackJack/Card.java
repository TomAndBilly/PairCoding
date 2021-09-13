package BlackJack;

public class Card extends Deck{
    private int cardValue;
    private String suit;
    private boolean faceCard;
    private String faceCardType;
    public Card(int cardValue, String suitInput){
        this.cardValue = cardValue;
        suit = suitInput;
    }
    public int getCardValue() {
        return cardValue;
    }
    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }
    public String getSuit() {
        return suit;
    }
    public void setSuit(String suit) {
        this.suit = suit;
    }
    public boolean isFaceCard() {
        return faceCard;
    }
    public void setFaceCard(boolean faceCard) {
        this.faceCard = faceCard;
    }
    public String getFaceCardType() {
        return faceCardType;
    }
    public void setFaceCardType(String faceCardType) {
        this.faceCardType = faceCardType;
    }
}
