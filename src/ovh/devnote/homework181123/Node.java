package ovh.devnote.homework181123;

public class Node<E> {
    private E value;
    private Node previous;
    private Node next;
    public Node(E v){
        this.value = v;
        this.next=null;
        this.previous=null;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
