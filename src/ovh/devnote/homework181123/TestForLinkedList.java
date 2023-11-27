package ovh.devnote.homework181123;

public class TestForLinkedList {
    public static void main(String[] args) {

        LinkedList<String> lista = new LinkedList<>();
        lista.add("pierwszy");
        lista.add("drugi");
        lista.add("trzeci");

        System.out.println("head = "+lista.getHead());
        System.out.println("tail = "+lista.getTail());
        System.out.println("size = "+lista.getSize());

        System.out.println(lista.remove("drugi"));
        System.out.println(lista);

        System.out.println("head = "+lista.getHead());
        System.out.println("tail = "+lista.getTail());
        System.out.println("size = "+lista.getSize());


    }
}
