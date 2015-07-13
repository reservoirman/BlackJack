/**
 * Created by tguh on 7/13/2015.
 */
public class BlackJackCard extends Card {

    private int _value;

    BlackJackCard(Suit s, Rank r)
    {
        super(s, r);
        switch(r)
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
                _value = r.ordinal() + 1;
                break;
        }
    }

    public int getValue()
    {
        return _value;
    }
}
