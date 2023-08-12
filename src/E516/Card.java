package E516;

public class Card {
    private String notation;

    public Card(String notation){
        this.notation = notation;
    }
    public String getDescription(){
        String result;
        String rank = notation.substring(0,1);
        String suit = notation.substring(1);

        if(notation.length() == 3){
            rank = notation.substring(0,2);
            suit = notation.substring(2);
        }

        String fullRank = "unknown";
        if(rank.equals("A")){
            fullRank = "Ace";
        }
        else if(rank.equals("2") ){
            fullRank = "Two";
        }
        else if(rank.equals("3") ){
            fullRank = "Three";
        }
        else if(rank.equals("4") ){
            fullRank = "Four";
        }
        else if(rank.equals("5") ){
            fullRank = "Five";
        }
        else if(rank.equals("6") ){
            fullRank = "Six";
        }
        else if(rank.equals("7") ){
            fullRank = "Seven";
        }
        else if(rank.equals("8") ){
            fullRank = "Eight";
        }
        else if(rank.equals("9") ){
            fullRank = "Nine";
        }
        else if(rank.equals("10") ){
            fullRank = "Ten";
        }
        else if(rank.equals("J") ){
            fullRank = "Jack";
        }
        else if(rank.equals("Q") ){
            fullRank = "Queen";
        }
        else if(rank.equals("K") ){
            fullRank = "King";
        }

        String fullSuit = "unknown";

        if(suit.equals("D") ){
            fullSuit = "Diamonds";
        }
        else if(suit.equals("H")){
            fullSuit = "Hearts";
        }
        else if(suit.equals("S")){
            fullSuit = "Spades";
        }
        else if(suit.equals("C")){
            fullSuit = "Clubs";
        }

        if(fullRank.equals("unknown") || fullSuit.equals("unknown")){
            result = "Unknown";
        }
        else{
            result = fullRank + " of " + fullSuit;
        }

        return result;
    }
}
