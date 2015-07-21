/**
 * Created by tguh on 7/13/2015.
 */


public class Card {
    public enum Suit { CLUBS, DIAMONDS, HEARTS, SPADES}
    public enum Rank { ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING}
    protected Suit _suit;
    protected Rank _rank;

    protected boolean faceUp = false;

    public Card(Suit suit, Rank rank)
    {
        _suit = suit;
        _rank = rank;

        switch(_rank)
        {
            case ACE:
                _value = 11;
                break;
            case JACK:
            case QUEEN:
            case KING:
                _value = 10;
                break;
            default:
                //this converts the enum into an integer value:
                _value = _rank.ordinal() + 1;
                break;
        }
    }

    public String toString()
    {
        String suit, rank;

        switch (_suit)
        {
            case CLUBS:
                suit = "Clubs";
                break;
            case DIAMONDS:
                suit = "Diamonds";
                break;
            case HEARTS:
                suit = "Hearts";
                break;
            default:        //SPADES
                suit = "Spades";
                break;
        }

        switch(_rank)
        {
            case ACE:
                rank = "Ace";
                break;
            case TWO:
                rank = "Two";
                break;
            case THREE:
                rank = "Three";
                break;
            case FOUR:
                rank = "Four";
                break;
            case FIVE:
                rank = "Five";
                break;
            case SIX:
                rank = "Six";
                break;
            case SEVEN:
                rank = "Seven";
                break;
            case EIGHT:
                rank = "Eight";
                break;
            case NINE:
                rank = "Nine";
                break;
            case TEN:
                rank = "Ten";
                break;
            case JACK:
                rank = "Jack";
                break;
            case QUEEN:
                rank = "Queen";
                break;
            default:        //KING
                rank = "King";
                break;
        }

        return faceUp ? rank + " of " + suit : "face-down card";

    }
    private int _value;


    public int getValue()
    {
        return _value;
    }


}
