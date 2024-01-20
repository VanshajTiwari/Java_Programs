package trees;

import java.util.Scanner;

public class BinaryTree {

    public BinaryTree(){

    }
    class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val=val;
        }
    }
    private Node root;


    public void populate(){
        Scanner sc=new Scanner(System.in);
        int val=sc.nextInt();
        root=new Node(val);
        populate(sc,root);
    }
    private void populate(Scanner sc,Node root){
        boolean right,left;
        System.out.print("Want to add At LEft of "+root.val+"--->  ");
        left=sc.nextBoolean();
        if(left){
            System.out.print("Add At LEft of "+root.val+"--->  ");
            root.left=new Node(sc.nextInt());
            populate(sc,root.left);
        }
        System.out.print("Want to add At Right of "+root.val+"--->  ");
        right=sc.nextBoolean();
        if(right){
            System.out.print("Add At Right of "+root.val+"--->  ");
            root.right=new Node(sc.nextInt());
            populate(sc,root.right);
        }
        return;
    }
    public void display(){

        display(this.root);
        System.out.println();
    }
    private void display(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.val);
        display(root.left);
        display(root.right);

    }
    public void inOrder(){

        inorder(this.root);
        System.out.println();
    }
    private void inorder(Node root){
        if(root==null)
            return;
        inorder(root.left);
        System.out.println(root.val);
        inorder(root.right);
    }
    public void preOrder(){

        preOrder(this.root);
        System.out.println();
    }
    private void preOrder(Node root){
        if(root==null)
            return;

        System.out.println(root.val);
        inorder(root.left);
        inorder(root.right);
    }
    public void postOrder(){

            postOrder(this.root);
        System.out.println();
    }
    private void postOrder(Node root){
        if(root==null)
            return;
        inorder(root.left);
        inorder(root.right);
        System.out.println(root.val);
    }
    public void prettyDisplay(){
            prettyDisplay(this.root,0);
    }
    private void prettyDisplay(Node root,int indent){
        if(root==null)
            return;
        prettyDisplay(root.right,indent+1);
        if(indent!=0){
            for(int i=0;i<indent-1;i++)
                System.out.print("|\t\t");
            System.out.println("|----->"+root.val);
        }
        else{
            System.out.println(root.val);
        }
        prettyDisplay(root.left,indent+1);
    }

























































//    public BinaryTree() {
//
//    }
//
//    private static class Node {
//        int value;
//        Node left;
//        Node right;
//
//        public Node(int value) {
//            this.value = value;
//        }
//    }
//
//    private Node root;
//
//    // insert elements
//    public void populate(Scanner scanner) {
//        System.out.println("Enter the root Node: ");
//        int value = scanner.nextInt();
//        root = new Node(value);
//        populate(scanner, root);
//    }
//
//    private void populate(Scanner scanner, Node node) {
//        System.out.println("Do you want to enter left of " + node.value);
//        boolean left = scanner.nextBoolean();
//        if (left) {
//            System.out.println("Enter the value of the left of " + node.value);
//            int value = scanner.nextInt();
//            node.left = new Node(value);
//            populate(scanner, node.left);
//        }
//
//        System.out.println("Do you want to enter right of " + node.value);
//        boolean right = scanner.nextBoolean();
//        if (right) {
//            System.out.println("Enter the value of the right of " + node.value);
//            int value = scanner.nextInt();
//            node.right = new Node(value);
//            populate(scanner, node.right);
//        }
//
//    }
//
//    public void display() {
//        display(this.root, "");
//    }
//
//    private void display(Node node, String indent) {
//        if (node == null) {
//            return;
//        }
//        System.out.println(indent + node.value);
//        display(node.left, indent + "\t");
//        display(node.right, indent + "\t");
//    }
//
//    public void prettyDisplay() {
//        prettyDisplay(root, 0);
//    }
//
//    private void prettyDisplay(Node node, int level) {
//        if (node == null) {
//            return;
//        }
//
//        prettyDisplay(node.right, level + 1);
//
//        if (level != 0) {
//            for (int i = 0; i < level - 1; i++) {
//                System.out.print("|\t\t");
//            }
//            System.out.println("|------->" + node.value);
//        } else {
//            System.out.println(node.value);
//        }
//        prettyDisplay(node.left, level + 1);
//    }
//
//    public void preOrder() {
//        preOrder(root);
//    }
//
//    private void preOrder(Node node) {
//        if (node == null) {
//            return;
//        }
//        System.out.print(node.value + " ");
//        preOrder(node.left);
//        preOrder(node.right);
//    }
//
//    public void inOrder() {
//        preOrder(root);
//    }
//
//    private void inOrder(Node node) {
//        if (node == null) {
//            return;
//        }
//        preOrder(node.left);
//        System.out.print(node.value + " ");
//        preOrder(node.right);
//    }
//
//    public void postOrder() {
//        preOrder(root);
//    }
//
//    private void postOrder(Node node) {
//        if (node == null) {
//            return;
//        }
//        preOrder(node.left);
//        preOrder(node.right);
//        System.out.print(node.value + " ");
//    }

}