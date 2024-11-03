/**
 * Node class for a linked structure used in stack implementation.
 * Each node stores an integer value and a reference to the next node.
 */
public class Nodo {
    private Nodo sig; // Reference to the next node in the stack
    private int dato; // Integer data stored in the node

    /**
     * Constructs a node with specified data and a reference to the next node.
     *
     * @param dato the integer data to store in this node
     * @param sig  the next node in the linked structure
     */
    public Nodo(int dato, Nodo sig) {
        this.dato = dato;
        this.sig = sig;
    }

    /**
     * Sets the reference to the next node in the list.
     *
     * @param sig the node that should follow this one
     */
    public void setSiguiente(Nodo sig) {
        this.sig = sig;
    }

    /**
     * Gets the next node in the list.
     *
     * @return the node that follows this one, or null if none
     */
    public Nodo getSiguiente() {
        return sig;
    }

    /**
     * Gets the integer data stored in this node.
     *
     * @return the integer value of this node
     */
    public int getDato() {
        return dato;
    }
}
