/**
 * Created by tguh on 7/13/2015.
 */
public class Main {

    static void testCard()
    {
        BlackJackCard c = new BlackJackCard(Card.Suit.CLUBS, Card.Rank.TWO);
        System.out.println(c.toString());
        System.out.println(c.getValue());
    }

    static public void main(String [] args)
    {
        testCard();
    }
}
