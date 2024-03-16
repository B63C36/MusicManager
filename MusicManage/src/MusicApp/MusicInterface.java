package MusicApp;

public interface MusicInterface {

    public boolean isEmpty();

    public boolean isFull();

    public void push(Object newItem);

    public Object pop();

    public int size();

    public void emptyStack();

    public void enqueue(Object newItem);

    public Object dequeue();

}
