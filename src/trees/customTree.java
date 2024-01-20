import java.util.Scanner;

public class customTree{
    public class Node{
        int data;
        Node left;
        Node right;
    }
    public Node root;
    Scanner sc=new Scanner(System.in);
    public customTree(){
        root=createTree();
    }
    private Node createTree(){
        int item=sc.nextInt();
        Node nn=new Node();
        nn.data=item;
        boolean hcl=sc.nextBoolean();
        if(hcl==true){
            nn.left=createTree();
        }
        boolean hlr=sc.nextBoolean();
        if(hlr==true){
            nn.right=createTree();
        }
        return nn;
    }

    public void Display(){
        Display(root);
    }
    private void Display(Node nn){
        if(nn==null){
            return ;
        }
        String s="<--"+nn.data+"-->";
        if(nn.left!=null){
            s=nn.left.data+s;
        }
        else{
            s="_"+s;}
        if(nn.right!=null){
            s=s+nn.right.data;
            }
        else{
            s=s+"_";
            }
        System.out.println(s);
        Display(nn.left);
        Display(nn.right);
    }
    public int findMax(Node nn){
        if(nn==null){
            return Integer.MIN_VALUE;
        }
        int lD=findMax(nn.left);
        int rD=findMax(nn.right);
        return Math.max(nn.data,Math.max(lD,rD));
    }
}