import LinkedList.LinkedList.DoublyLinkedList;
import LinkedList.LinkedList.Node;
import Sorting.Bubblesort;

public class Main {
    public static void main(String[] args) {
        Bubblesort bubblesort = new Bubblesort();
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        bubblesort.bubbleSort(arr);
        System.out.println("Sorted array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}