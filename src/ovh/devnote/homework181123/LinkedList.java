package ovh.devnote.homework181123;

public class LinkedList<E> {
    private Node head;
    private Node tail;
    private int size;
    public LinkedList(){}

    public void add(E v){
        if(head == null){
            head = new Node(v);
            tail=head;
            size++;
        }
        else{
            Node curr = head;
            while(curr.getNext()!=null){
                curr = curr.getNext();
            }
            Node node = new Node(v);
            node.setPrevious(curr);
            curr.setNext(node);
            size++;
            tail=node;
        }
    }
    public E remove(E e){
        if ( head.getValue().equals(e)){
            E returned = (E)head.getValue();
            head = head.getNext();
            tail=head;
            size--;
            return returned;
        }else{
            Node curr = head;
            while(curr.getNext()!=null && !curr.getNext().getValue().equals(e) ){
                curr=curr.getNext();
                }
            if (curr.getNext()!=null){
                E returned = (E)curr.getNext().getValue();
                Node newnode = curr.getNext().getNext();
                newnode.setPrevious(newnode);
                tail=newnode;
                curr.setNext(newnode);
                size--;
                return (E)returned;
            }
        }
        return null;
    }

    public String toString(){
        Node curr = head;
        if(curr==null){
            return "LinkedList{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("LinkedList{");
        while( curr!=null){
            sb.append(curr.getValue());
            sb.append(",");
            curr=curr.getNext();
        }
        sb.deleteCharAt(sb.lastIndexOf(","));
        sb.append("}");
        return sb.toString();
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getSize() {
        return size;
    }

    private class Node<E> {
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
}

