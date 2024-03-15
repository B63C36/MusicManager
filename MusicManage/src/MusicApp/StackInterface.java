/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MusicApp;

/**
 *
 * @author Hamilton1
 */
public interface StackInterface {

    public boolean isEmpty();

    public boolean isFull();

    public void push(Object newItem);
    public void push2(Object newItem);

    public Object pop();

    public int size();
    public int size2();

    public void emptyStack();
    
    public void enqueue(Object newItem);
    public Object dequeue();
    
}
