/**
 * Implementation of a simple stack (Pila) using linked nodes.
 * This class provides basic stack operations: push, pop, and isEmpty.
 */
public class MiPila implements Pila {
    private Nodo cabeza; // Reference to the top (head) node of the stack

    /**
     * Constructs an empty stack.
     */
    MiPila() {
        this.cabeza = null;
    }

    /**
     * Returns the head node of the stack.
     * 
     * @return the current top node of the stack, or null if the stack is empty
     */
    public Nodo getCabeza() {
        return cabeza;
    }

    /**
     * Pushes a new integer onto the top of the stack.
     * 
     * @param dato the integer value to be pushed onto the stack
     */
    @Override
    public void push(int dato) {
        if (cabeza == null) {
            // If stack is empty, create a new node as the head
            cabeza = new Nodo(dato, null);
        } else {
            // If stack is not empty, create a new node that points to the current head
            Nodo temp = this.cabeza;
            cabeza = new Nodo(dato, temp); // New head now contains the new data
        }
    }

    /**
     * Pops the top integer off the stack.
     * 
     * @return the integer value at the top of the stack
     * @throws NullPointerException if the stack is empty
     */
    @Override
    public int pop() {
        int dato = cabeza.getDato(); // Retrieve data from the head node
        cabeza = cabeza.getSiguiente(); // Move head to the next node
        return dato;
    }

    /**
     * Checks if the stack is empty.
     * 
     * @return true if the stack is empty, false otherwise
     */
    @Override
    public boolean esVacia() {
        return cabeza == null;
    }
}
