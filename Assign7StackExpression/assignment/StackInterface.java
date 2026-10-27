package assignment;

public interface StackInterface<T> {
    /**
     * Adds an item to the top of the stack.
     * @param item the element to push
     */
    public void push(T item);

    /**
     * Removes and returns the item at the top of the stack.
     * @return the top element
     * @throws java.util.EmptyStackException if the stack is empty
     */
    public T pop();

    /**
     * Returns the item at the top of the stack without removing it.
     * @return the top element
     * @throws java.util.EmptyStackException if the stack is empty
     */
    public T peek();

    /**
     * Checks if the stack contains any elements.
     * @return true if empty, false otherwise
     */
    public boolean isEmpty();

    /**
     * Returns the number of elements currently in the stack.
     * @return the size of the stack
     */
    public int size();
}

