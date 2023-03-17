package Black_Jack;

public class Card {
    private String suit;
    private String rank;
    private int cardID;
    private String cardName; 
    private Card nextCard;
// ************************ CONSTRUCTORS **********************

    public Card(int cardID){
        //card constructor
        this.cardID = cardID;
    }

// ***************** SET FUCNTIONS ********************

    public void setSuit(String suit){
        this.suit = suit;
    }

    public void setRank(String rank){
        this.rank = rank;
    }

    public void setCardName(String cardName){
        this.cardName = cardName;
    }
    public void setNext(Card next){
        nextCard = next;
    }

//********************* GET FUCNTIONS **********************

    public String getSuit(){
        return suit;
    }

    public String getRank(){
        return rank;
    }
    public int getCardID(){
        return cardID;
    }

    public String getCardName(){
        return cardName;
    }

    public Card getNextCard(){
        return nextCard;
    }

}
