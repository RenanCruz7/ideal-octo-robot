package LinkedList;

public class LinkedList {

    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static class DoublyLinkedList{
        Node head;
        Node tail;
        public DoublyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void add_to_front(int data){
            Node new_node = new Node(data);
            new_node.next = head;
            if(head != null) {
                head.prev = new_node;
            }else{
                tail = new_node;
            }
            head = new_node;
        }

        public void add_to_back(int data){
            Node new_node = new Node(data);
            new_node.prev = tail;
            if(tail != null) {
                tail.next = new_node;
            }else{
                head = new_node;
            }
            tail = new_node;
        }

        public int remove_from_front(){
            if(head == null) return -1;
            int removed_value = head.data;
            head = head.next;
            if(head != null) {
                head.prev = null;
            }else{
                tail = null;
            }
            return removed_value;
        }

        public int remove_from_back(){
            if(tail == null) return -1;
            int removed_value = tail.data;
            tail = tail.prev;
            if(tail != null) {
                tail.prev = null;
            }else{
                head = null;
            }
            return removed_value;
        }
        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }

        public void printListReverse() {
            Node current = tail;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.prev;
            }
            System.out.println();
        }
    }
}
