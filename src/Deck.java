import java.util.Collections;
import java.util.Stack;

/**
 * Created by tguh on 7/13/2015.
 */
public class Deck {
    protected final int FullDeck = 52;
    private Stack<Card> _deck;

    public Deck()
    {
        _deck = new Stack<>();
        for (Card.Suit suit: Card.Suit.values())
        {
            for (Card.Rank rank : Card.Rank.values())
            {
                Card c = new Card(suit, rank);
                _deck.push(c);
            }
        }
    }

    public void Shuffle()
    {
        Collections.shuffle(_deck);
    }

    public void Print()
    {
        for (Card c : _deck)
        {
            System.out.println(c.toString());
        }
        System.out.println();
    }

    public Hand DealHouse()
    {
        Card first = _deck.pop();
        Card second = _deck.pop();
        first.faceUp = true;
        second.faceUp = false;

        Hand h = new Hand();
        h.addCard(first);
        h.addCard(second);

        return h;
    }

    public Hand Deal()
    {
        Card first = _deck.pop();
        Card second = _deck.pop();
        first.faceUp = true;
        second.faceUp = true;

        Hand h = new Hand();
        h.addCard(first);
        h.addCard(second);

        return h;
    }

    public void Hit(Hand h)
    {
        Card c = _deck.pop();
        c.faceUp = true;
        h.addCard(c);
    }

    public void PutBack(Card c)
    {
        _deck.add(c);
    }



    public void PutBackHand(Hand h)
    {
        if (h.HandCount() == 0)
        {
            System.out.println("Your hand doesn't contain any cards!");
        }
        else {
            while (h.HandCount() > 0)
            {
                _deck.add(h.removeCard());
            }
        }

    }


}
