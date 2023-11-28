package ovh.devnote.homework181123;

public class MinHeap<E extends Comparable<E>> {
    private final LinkedList<E> linkedList = new LinkedList<>();
    public MinHeap(){}

    public void push(E e){
        linkedList.add(e);
        heapifyUp();
    }

    private void heapifyUp() {
        int elIndex = linkedList.getSize()-1;
        while(elIndex>0){
             int parIndex = (elIndex-1)/2;
             E curr = linkedList.get(elIndex);
             E parr = linkedList.get(parIndex);
             if ( curr.compareTo(parr)<0) {
                    swap(parIndex, elIndex);
                    elIndex =parIndex;
             }
              else{
                  break;
             }
        }

    }
    public void swap(int idx1, int idx2){
        E temp = linkedList.get(idx1);
        linkedList.set(idx1, linkedList.get(idx2));
        linkedList.set(idx2,temp);
    }

    @Override
    public String toString() {
        return linkedList.toString().replaceAll("LinkedList","MinHeap");
    }
}
