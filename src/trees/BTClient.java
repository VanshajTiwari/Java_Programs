package trees;



public class BTClient {
    public static void main(String[] args) {
        BinaryTree t=new BinaryTree();
        t.populate();
        t.display();
        t.preOrder();
        t.postOrder();
        t.prettyDisplay();
    }
}
