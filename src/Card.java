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
    }

    public String toString()
    {
        String suit, rank;

        switch (_suit)
        {
            case CLUBS:
                suit = "CLUBS";
                break;
            case DIAMONDS:
                suit = "DIAMONDS";
                break;
            case HEARTS:
                suit = "HEARTS";
                break;
            default:        //SPADES
                suit = "SPADES";
                break;
        }

        switch(_rank)
        {
            case ACE:
                rank = "ACE";
                break;
            case TWO:
                rank = "TWO";
                break;
            case THREE:
                rank = "THREE";
                break;
            case FOUR:
                rank = "FOUR";
                break;
            case FIVE:
                rank = "FIVE";
                break;
            case SIX:
                rank = "SIX";
                break;
            case SEVEN:
                rank = "SEVEN";
                break;
            case EIGHT:
                rank = "EIGHT";
                break;
            case NINE:
                rank = "NINE";
                break;
            case TEN:
                rank = "TEN";
                break;
            case JACK:
                rank = "JACK";
                break;
            case QUEEN:
                rank = "QUEEN";
                break;
            default:        //KING
                rank = "KING";
                break;
        }

        return rank + " OF " + suit;

    }



}
