package DSA;

class Implement_Tree {
    static class node {
        int data;
        node left;
        node right;

        node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        };
        node(int data, node left, node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        };
        public void addleft(node left){
            this.left=left;
        }
        public void addright(node right){
            this.right=right;
        }

    }
        public static void main(String[] args) {
            node tree=new node(1);
            node tree1=new node(2);
            node tree2=new node(3);
            node tree4=new node(4);
            tree.addleft(tree1);
            tree.addright(tree2);
            tree1.addleft(tree4);
            postOrder(tree);
            System.out.println();
            inOrder(tree);
            System.out.println();
            preOrder(tree);
            System.out.println();
            System.out.println(height(tree));
        }
        public static int height(node tree){
            if(tree==null)
                return 0;
            int lheight=height(tree.left);
            int rheight=height(tree.right);
            if (lheight > rheight)
                return (lheight + 1);
            else
                return (rheight + 1);
        }
    public static void preOrder(node tree){
        if(tree==null)
            return;
        System.out.print(tree.data+" ");
        preOrder(tree.left);
        preOrder(tree.right);
    }
    public static void postOrder(node tree){
        if(tree==null)
            return;
        postOrder(tree.left);
        postOrder(tree.right);
        System.out.print(tree.data+" ");
    }
    public static void inOrder(node tree){
        if(tree==null)
            return;
        inOrder(tree.left);
        System.out.print(tree.data+" ");
        inOrder(tree.right);
    }

}
