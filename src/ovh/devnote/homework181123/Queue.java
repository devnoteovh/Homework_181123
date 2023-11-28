package ovh.devnote.homework181123;

public class Queue<E> {
    private final LinkedList<E> linkedList=new LinkedList<>();

    public Queue(){}
    public void offer(E e) {
        linkedList.add(e);
    }
    public E poll() {
        return linkedList.remove(linkedList.peek());
    }

    @Override
    public String toString() {
        return linkedList.toString().replaceAll("LinkedList","Queue");
    }
}
