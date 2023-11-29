package ovh.devnote.homework181123;

public class QuiteStrangeQueue {
    private final LinkedList<StrangeObject> ll = new LinkedList<>();

    public void push(StrangeObject o){
        ll.add(o);
    }
    public StrangeObject popFirst(){
        return ll.remove(ll.getHead());
    }

    public StrangeObject popHighThree(){
        MinHeap<StrangeObject> minHeap = new MinHeap<>();
        minHeap.push(ll.get(0));
        minHeap.push(ll.get(1));
        minHeap.push(ll.get(2));

        return ll.remove(minHeap.pop());
    }

    @Override
    public String toString() {
        return ll.toString().replaceAll("LinkedList","QuiteStrangeQueue");
    }
}
