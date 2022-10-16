import java.util.Collections;
import java.util.*;

public class CardStack implements Project1StackInterface<Card>
{
    private Stack<Card> cardsStack;
    protected int countOne = 0;
    protected int countTwo = 0;

    @Override
    public void push(int suit, int face) {
        
    }

    @Override
    public Card pop() {
        return null;
    }

    @Override
    public Card top() {
        return null;
    }

    @Override
    public Card popTop() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}