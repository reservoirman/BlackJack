/**
 * Created by tguh on 7/13/2015.
 */
public class Main {

    static void testCard()
    {
        Card c = new Card(Card.Suit.CLUBS, Card.Rank.TWO);
        System.out.println(c.toString());
        System.out.println(c.getValue());
        Deck d = new Deck();

        d.Print();
        d.Shuffle();
        d.Print();
        Hand h = d.Deal();
        d.Print();
        d.PutBackHand(h);
        d.Print();
    }

    static public void main(String [] args)
    {
        testCard();
    }
}
