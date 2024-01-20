package oops;

public class CustomGenericsPair<P,Q> {
    P x;
    Q y;

    public static void main(String[] args) {
        CustomGenericsPair<Integer,Boolean> p=new CustomGenericsPair<>();
        p.x=123;
        p.y=false;
    }
}
