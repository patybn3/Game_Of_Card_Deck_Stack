import java.util.Stack;

public class Card<T> extends Stack<Card>
{
    // I read this source https://fpl.cs.depaul.edu/jriely/thinkapjava/thinkapjava.array2.html
    public static final String[] SUITS = {"CLUBS", "DIAMONDS", "HEARTS", "SPADES"};
    public static final String[] FACES = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"};

    private int suit;
    private int face;

    public Card(T suit, T face)
    {
        this.suit = (int) suit;
        this.face = (int) face;
    }
}
