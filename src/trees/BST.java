package trees;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class BST {
    public BST(){

    }
    class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val=val;
        }
    }
    Node root;

    public void populate(){

    }
    private void populate(Node root, Scanner sc){
        if(root==null){
            root.val=val;
        }
        System.out.println("Want to Add Element :)");
        boolean flag=sc.nextBoolean();
        if(flag){
            int val=sc.nextInt();
            if(val>root.val)
                populate(root.right,sc);
            else{
                populate(root.left,sc);
            }
        }
    }
}
