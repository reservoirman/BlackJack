/**
 * Created by tguh on 7/13/2015.
 */
import java.util.Collections;
import java.util.Stack;
import java.util.ArrayList;

public class BlackJackDeck extends Deck {
    protected final int FullDeck = 52;
    private Stack<Card> _deck;

    public BlackJackDeck()
    {

    }

    public void Shuffle()
    {
        Collections.shuffle(_deck);
    }

    public Hand DealHouse()
    {
        Card first = _deck.pop();
        Card second = _deck.pop();
        first.faceUp = true;

        Hand h = new BlackJackHand();
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

        Hand h = new BlackJackHand();
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

    public void PutBackHand(ArrayList<Card> hand)
    {
        _deck.addAll(hand);
    }

}
