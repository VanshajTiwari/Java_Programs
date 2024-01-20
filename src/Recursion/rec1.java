package Recursion;

public class rec1 {
    public static void main(String[] args) {
        mess();
    }
    static void mess(){
        System.out.println("Hello World");
        mess1();}
    static void mess1(){
        mess2();
        System.out.println("Hello World");
    }
    static void mess2(){
        mess3();
        System.out.println("Hello World");
    }
    static void mess3(){
        System.out.println("Hello World");
    }
}
