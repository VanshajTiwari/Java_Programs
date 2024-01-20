package oops.Abstraction;

public class Client_Abstract_class extends abstract_demo{
    @Override
    public int fun1(){
        System.out.println("hello");
        return 0;
    }
    public static void main(String[] args) {
        Client_Abstract_class a=new Client_Abstract_class();
        System.out.println(a.fun1());
}
}
