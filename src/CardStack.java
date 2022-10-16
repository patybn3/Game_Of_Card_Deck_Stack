import java.util.Collections;
import java.util.*;

public class CardStack implements Project1StackInterface<Card>
{
    private Stack<Card> cardsStack;
    protected int countOne = 0;
    protected int countTwo = 0;

    public CardStack()
    {
        this.cardsStack = new Stack<>();
        push();;
    }

    @Override
    public void push() {
        if(isFull())
        {
            System.out.println("This Deck is Full.");
        }
        else {
            for (int i = 0; i < 13; i++)
            {
                for (int j = 0; j < 4; j++)
                {
                    cardsStack.add(new Card(j, i));
                }
            }
        }
    }

    @Override
    public Card pop()
    {
        if(isEmpty())
        {
            System.out.println("There are no cards to draw.");
            return null;
        }
        else
        {
            return cardsStack.pop();
        }
    }

    @Override
    public Card top()
    {
        if(isEmpty())
        {
            System.out.println("There are no cards in the deck.");
            return null;
        }
        else {
            return cardsStack.peek();
        }
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

    public boolean isFull()
    {
        return true;
    }
}