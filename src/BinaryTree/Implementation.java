package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class Implementation {

    public static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class BinaryTree{
        TreeNode root;

        public BinaryTree(){
            this.root = null;
        }

        public void insert(int data){
            TreeNode newNode = new TreeNode(data);
            if(this.root == null){
                this.root = newNode;
                return;
            }else{
                this.insertRecursive(this.root, newNode);
            }
        }

        public void insertRecursive(TreeNode root, TreeNode newNode){
            if(newNode.data < root.data){
                if(root.left == null){
                    root.left = newNode;
                }else{
                    this.insertRecursive(root.left, newNode);
                }
            }else{
                if(root.right == null){
                    root.right = newNode;
                }else{
                    this.insertRecursive(root.right, newNode);
                }
            }

        }

        public boolean search(int data){
            return this.searchRecursive(this.root,data);
        }
        public boolean searchRecursive(TreeNode root, int data){
            if(root == null){
                return false;
            }
            if(root.data == data){
                return true;
            }
            if(data < root.data){
                return this.searchRecursive(root.left, data);
            }else{
                return this.searchRecursive(root.right, data);
            }
        }

       public List<Integer> preorder(){
           List<Integer> result = new ArrayList<>();
            preorderRecursive(this.root, result);
            return result;
       }

       public void preorderRecursive(TreeNode node, List<Integer> result){
           if (node != null) {
               result.add(node.data); // Visita o nó atual
               preorderRecursive(node.left, result); // Visita o filho à esquerda
               preorderRecursive(node.right, result); // Visita o filho à direita
           }
       }

        public List<Integer> postorder(){
            List<Integer> result = new ArrayList<>();
            postorderRecursive(this.root, result);
            return result;
        }

        public void postorderRecursive(TreeNode node, List<Integer> result){
            if (node != null) {
                postorderRecursive(node.left, result); // Visita o filho à esquerda
                postorderRecursive(node.right, result); // Visita o filho à direita
                result.add(node.data); // Visita o nó atual
            }
        }

        public List<Integer> inorder(){
            List<Integer> result = new ArrayList<>();
            inorderRecursive(this.root, result);
            return result;
        }

        public void inorderRecursive(TreeNode node, List<Integer> result){
            if (node != null) {
                inorderRecursive(node.left, result); // Visita o filho à esquerda
                result.add(node.data); // Visita o nó atual
                inorderRecursive(node.right, result); // Visita o filho à direita
            }
        }

    }
}
