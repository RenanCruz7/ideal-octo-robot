import LinkedList.LinkedList.DoublyLinkedList;
import LinkedList.LinkedList.Node;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.add_to_front(3);
        dll.add_to_front(2);
        dll.add_to_front(1);
        dll.add_to_back(4);
        dll.add_to_back(5);

        System.out.println(dll.remove_from_front()); // removes 1
        System.out.println(dll.remove_from_back()); // removes 5


    }
}