package ovh.devnote.homework181123;

public class LinkedList<E> {
    private Node head;
    private Node tail;
    private int size;
    public LinkedList(){}

    public E peek(){
        return (E)head.getValue();
    }

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
        if(size==0)
            return null;
        if ( head.getValue().equals(e)){
            E returned = (E)head.getValue();
            head = head.getNext();
            if(head==null || head.getNext()==null)
                tail=head; // head equals tail and/or null
            else
                tail=head.getNext();
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
                if (newnode!= null) {
                    newnode.setPrevious(newnode);
                    tail = newnode;
                    curr.setNext(newnode);
                }else{
                    curr.setNext(null);
                    tail=curr;
                }

                size--;
                return (E)returned;
            }
        }
        return null;
    }

    public E removeLast() {
        if(size==0)
            return null;
        E e = (E)tail.getValue();
        tail=tail.previous;
        if (tail!=null)
            tail.setNext(null);
        else{
            head=tail;
        }
        size--;
        return e;
    }

    public E get(int index){
        if (index<0 || index>this.size){
            return null;
        }
        int i=0;
        Node<E> node = head;
        while(i<index){
            node = node.getNext();
            i++;
        }
        return node.getValue();
    }

    public void set(int index,E e){
        int i=0;
        Node<E> node = head;
        while(i<index){
            node = node.getNext();
            i++;
        }
        node.setValue(e);
    }

    public int indexOf(E e){
        int i=0;
        Node<E> node = head;
        while(!node.getValue().equals(e)){
            node = node.getNext();
            i++;
        }
        return i;
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

    public E getHead() {
        if(head==null){
            return null;
        }
        return (E)head.getValue();
    }

    public E getTail() {
        if (tail==null)
            return null;
        return (E)tail.getValue();
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

