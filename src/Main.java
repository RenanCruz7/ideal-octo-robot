import BinaryTree.Implementation;
import LinkedList.LinkedList.DoublyLinkedList;
import LinkedList.LinkedList.Node;
import Sorting.Bubblesort;
import Sorting.Quicksort;

public class Main {
    public static void main(String[] args) {
        // Criação da árvore binária
        Implementation.BinaryTree tree = new Implementation.BinaryTree();

        // Inserção de valores
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        // Teste de busca
        System.out.println("Busca pelo valor 40: " + tree.search(40)); // true
        System.out.println("Busca pelo valor 90: " + tree.search(90)); // false

        // Teste de travessias
        System.out.println("Pré-ordem: " + tree.preorder()); // [50, 30, 20, 40, 70, 60, 80]
        System.out.println("Pós-ordem: " + tree.postorder()); // [20, 40, 30, 60, 80, 70, 50]
        System.out.println("Em-ordem: " + tree.inorder()); // [20, 30, 40, 50, 60, 70, 80]
    }
}