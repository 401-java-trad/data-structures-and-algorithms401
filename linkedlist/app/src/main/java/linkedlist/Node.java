package linkedlist;

public class Node<T> {
    private T element; // reference to the element stored at this node
    
    private Node<T> next; // reference to the subsequent node in the list
    

    public Node(T e, Node<T> n) {  element = e;
         next = n;
         }

    public T getElement() {
        return element;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> n) {
        next = n;
    

    } 
    
// T value;
// Node<T> next;

// public Node(T value) {
// this.value = value;
// }

}
