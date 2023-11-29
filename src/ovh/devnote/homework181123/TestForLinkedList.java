package ovh.devnote.homework181123;

import java.util.Arrays;

public class TestForLinkedList {
    public static void main(String[] args) {

        MinHeap<String> minHeap = new MinHeap<>();
        String[] tab = {"3","4","0","2"};
        for(int i=0;i<tab.length;i++){
            minHeap.push(tab[i]);
        }
        for(int i=0;i<tab.length;i++){
            tab[i]=minHeap.pop();
        }
        System.out.println(Arrays.toString(tab));

        System.out.println(minHeap);
        System.out.println(minHeap.pop());
        System.out.println(minHeap.pop());
        System.out.println(minHeap.pop());
        System.out.println(minHeap);

        LinkedList<String> lista = new LinkedList<>();
        lista.add("pierwszy");
        lista.add("drugi");
        lista.add("trzeci");

        System.out.println(lista.indexOf("trzeci"));
        System.out.println(lista.indexOf("czwarty"));
        //lista.removeLast();
        //lista.removeLast();
        //lista.removeLast();
        //lista.removeLast();

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
        queue.poll();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);

    }
}
