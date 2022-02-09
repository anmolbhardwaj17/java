package LinkedList;

public class Main {
    public static void main(String[] args) {
        linkedlist list = new linkedlist();

        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(4);
        list.insertFirst(17);
        list.insertLast(99);

        list.insert(100,3);

        list.display();
    }
}
