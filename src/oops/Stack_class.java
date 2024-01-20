package oops;

public class Stack_class implements Diya{
    // ek class ek interface ko inherit krta h to implements use hota hai

    @Override
    public int peek() {
        return 0;
    }

    @Override
    public int pop() {
        return 0;
    }
    @Override
    public void push(int item){
        System.out.println(Diya.x);
    }
}
