import java.util.ArrayList;

/**
 * Created by tguh on 7/13/2015.
 */
public abstract class Deck {
    protected final int FullDeck = 52;
    abstract void Shuffle();
    abstract void Hit(Hand h);


}
