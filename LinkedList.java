public class LinkedList<T> {

    private Node<T> head;
    private Node<T> current;

    public LinkedList() {
        head = null;
        current = null;
    }

    public boolean isEmpty() {
        if (head == null)
            return true;
        return false;
    }

    public boolean full() {
        return false;
        // This will only be TRUE if the computer runs out of memory.
    }

    public boolean last() {

        return current != null && current.next == null;

    }

    public void findFirst() {
        current = head;
    }

    public void findNext() {
        current = current.next;
    }

    public void update(T e) {
        current.data = e;
    }

    public T retrieve() {
        return current.data;
    }

    public void insert(T e) {

        Node<T> temp = new Node<T>(e);

        if (head == null) {
            head = temp;
            current = temp;
        }

        else {

            temp.next = current.next;
            current.next = temp;
            current = temp;

        }

    }

    public void addLast(T e) { // as a member

        Node<T> x = new Node<T>(e);

        if (head == null) {
            head = current = x;
        }

        else {

            Node<T> h = head;

            while (h.next != null) {
                h = h.next;
            }

            h.next = x;
            current = x;

        }
    }

    public void remove() {

        if (current == head) {
            head = head.next;
            current = current.next;
        }

        else {
            Node<T> p = head;

            while (p.next != current) {
                p = p.next;
            }

            p.next = current.next;

            if (current.next != null) {
                current = current.next;
            } else
                current = head;
        }
    }

    public void display() { // it is from myself just for check the code
        findFirst();
        while (current != null) {
            System.out.print(current.data + "   ");
            current = current.next;
        }
    }

    public boolean isInList(LinkedList<Integer> list, int value) {
        Node<Integer> current = list.head;
        while (current != null) {
            if (current.data.equals(value)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int myltiplyALL(LinkedList<T> l){

        Node<T> c = l.head;
        int mul=1;

        if(c == null) return 0;
        

        if(c.next == null) return (int) c.data;

        while(c.next != null){
            mul = (int)c.data * mul;
            c = c.next;
        }
        mul = (int)c.data * mul;

        return mul;

    }

    

    /*
     * public int totla(){
     * listD.findFirst();
     * for(int i = 0 ; i < count ; i++){
     * int multi = listD.retrieve() * multi;
     * listD.findNext();
     * }
     * }
     */

}