package oops;

public interface Diya {
    public void push(int item);
    public int pop();
    public int peek();  /* 89999999999999999 access modifier are public */

    default void fun(){

    }
    public static void fun1(){

    }
    public static final int x=9;
}

    /*
                -=-=-=-=-=-=-=-=-=-= FINAL -=-=-=-=-=-=-=--=-=-=-
        kisi methods ke samne final lg gya to method override no ho skta
        kisi class ke samne final lg gye to inherit no ho skta
        jis variable ke aage final vo variable ki value change ni ho skta constant bn jata h
    */

