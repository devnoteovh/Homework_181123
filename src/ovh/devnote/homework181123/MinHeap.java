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

    public E pop(){
        E headV =linkedList.getHead();
        E tailV =linkedList.getTail();
        linkedList.set(0,tailV);
        linkedList.removeLast();

        heapifyDown();
        return headV;
    }

    private void heapifyDown() {
        int index =0;
        int lessIndex=0;
        while(true){
            int leftChildIndex = 2*index +1;
            int rightChildIndex = 2*index +2;
            //searching index of smallest child:
            if ( leftChildIndex < linkedList.getSize() &&
                    linkedList.get(leftChildIndex).compareTo(linkedList.get(lessIndex))<0){
                lessIndex =  leftChildIndex;
            }
            if ( rightChildIndex < linkedList.getSize() &&
                    linkedList.get(rightChildIndex).compareTo(linkedList.get(lessIndex))<0){
                lessIndex =  leftChildIndex;
            }
            if (lessIndex != index){
                swap(index,lessIndex);
                index = lessIndex;
            }else{
                break;
            }

        }
    }

    public void swap(int idx1, int idx2){
        E temp = linkedList.get(idx1);
        linkedList.set(idx1, linkedList.get(idx2));
        linkedList.set(idx2,temp);
    }

    public int size(){
        return linkedList.size();
    }

    @Override
    public String toString() {
        return linkedList.toString().replaceAll("LinkedList","MinHeap");
    }
}
