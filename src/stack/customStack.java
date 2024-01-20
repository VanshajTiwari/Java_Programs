import java.util.*;
public class customStack {
    private int size=0;
    private int[] Arr;
    private int point=0;

    private int peek=0;
    customStack(int size){
        this.size=size;
        int[] arr=new int[size];
    }
    public int peek(){
        return this.Arr[0];
    }
    public void push(int item){
        if(point<size){
            this.Arr[this.point]=item;
        ++point;}
        else{
            size=size*2;
            int[] temp=new int[size];
            for(int i=0;i<=point;i++){
                temp[i]=Arr[i];
            }
            this.Arr=temp;
        }
    }
    public void pop(){
        --point;
    }
    public void display(){
        for(int i=0;i<=point;i++){
            System.out.print(Arr[i]+"->");
        }
    }
    public static void main(String[] args) {
        customStack a=new customStack(10);
        a.push(1);
        a.push(2);
        a.push(3);
        a.push(4);
        a.push(5);

    }
}
