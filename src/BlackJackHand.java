/**
 * Created by tguh on 7/13/2015.
 */
public class BlackJackHand extends Hand {
    int GetHandValue()
    {
        int totalValue = 0;
        int aceCount = 0;
        //raw value
        for (Card c: _hand)
        {
            BlackJackCard bc = (BlackJackCard)c;
            if (bc._rank == Card.Rank.ACE)
            {
                aceCount++;
            }
            totalValue += bc.getValue();
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
