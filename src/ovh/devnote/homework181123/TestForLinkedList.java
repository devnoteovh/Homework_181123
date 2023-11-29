package ovh.devnote.homework181123;

public class TestForLinkedList {
    public static void main(String[] args) {

        MinHeap<String> minHeap = new MinHeap<>();
        minHeap.push("3");
        minHeap.push("4");
        minHeap.push("5");
        minHeap.push("0");
        minHeap.push("1");

        System.out.println(minHeap);

        LinkedList<String> lista = new LinkedList<>();
        lista.add("pierwszy");
        lista.add("drugi");
        lista.add("trzeci");

        lista.removeLast();
        lista.removeLast();
        lista.removeLast();
        lista.removeLast();

        //lista.remove("trzeci");


        System.out.println(lista);

        System.out.println("head = "+lista.getHead());
        System.out.println("tail = "+lista.getTail());
        System.out.println("size = "+lista.getSize());



        Queue<String> queue= new Queue<>();
        queue.offer("pierwszy");
        queue.offer("drugi");
        queue.offer("trzeci");

        System.out.println(queue);
        queue.poll();
        System.out.println(queue);

    }
}
