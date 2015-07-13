import java.util.Stack;

/**
 * Created by tguh on 7/13/2015.
 */
public abstract class Hand {

    Stack<Card> _hand;

    public Hand()
    {
        _hand = new Stack<>();
    }

    public void addCard(Card c)
    {
        _hand.push(c);
    }

}
