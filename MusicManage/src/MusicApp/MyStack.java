package MusicApp;

import java.util.*;

public class MyStack implements MusicInterface {

    private ArrayList<String> theStack;

    public MyStack() {
        theStack = new ArrayList<String>();
    }

    public int size() {
        return (theStack.size() / 2);

    }

    public boolean isEmpty() {
        return theStack.isEmpty();
    }

    public boolean isFull() {
        return false;
    }

    public Object pop() {
        if (!(theStack.isEmpty())) {
            return theStack.remove(0);
        } else {
            return null;
        }
    }

    public void push(Object newItem) {
        theStack.add(0, (String) newItem);

    }

    public void emptyStack() {
        while (!theStack.isEmpty()) {
            pop();
        }
    }

    public void enqueue(Object newItem) {
        theStack.add((String) newItem);
    }

    public Object dequeue() {
        if (theStack.size() > 0) {
            return theStack.remove(0);
        } else {
            return null;
        }
    }
}
