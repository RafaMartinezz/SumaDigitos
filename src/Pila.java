/**
 * Interface for a stack (Pila) data structure.
 * Defines basic stack operations for integer values.
 */
public interface Pila {

    /**
     * Pushes an integer onto the top of the stack.
     *
     * @param dato the integer value to push onto the stack
     */
    void push(int dato);

    /**
     * Removes and returns the integer at the top of the stack.
     *
     * @return the integer value at the top of the stack
     * @throws NoSuchElementException if the stack is empty
     */
    int pop();

    /**
     * Checks if the stack is empty.
     *
     * @return true if the stack has no elements, false otherwise
     */
    boolean esVacia();
}
