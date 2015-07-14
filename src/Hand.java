import java.util.Stack;

/**
 * Created by tguh on 7/13/2015.
 */
public class Hand {

    Stack<Card> _hand;

    public Hand()
    {
        _hand = new Stack<>();
    }

    public void addCard(Card c)
    {
        _hand.push(c);
    }

    public Card removeCard() { return _hand.pop();}

    public int HandCount()
    {
        return _hand.size();
    }

    int GetHandValue()
    {
        int totalValue = 0;
        int aceCount = 0;
        //raw value
        for (Card c: _hand)
        {
            if (c._rank == Card.Rank.ACE)
            {
                aceCount++;
            }
            totalValue += c.getValue();
        }
        //check if there were any aces
        while (aceCount > 0 && totalValue > 21) {
            totalValue -= 10;
            aceCount--;
        }

        return totalValue;
    }

    void PrintHand()
    {
        for (Card c: _hand)
        {
            System.out.println(c.toString());
        }
    }

}
