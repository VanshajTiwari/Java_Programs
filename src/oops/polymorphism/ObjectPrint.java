package oops.polymorphism;
import java.util.*;
public class ObjectPrint {
    int num;
    int number;
    ObjectPrint(){
        this.num=-1;
        this.number=0;
    }
    public String toString(){
        return "this is Num => " + num + " and Number => " + number;
    }
public static void main(String[] args){
        ObjectPrint abc=new ObjectPrint();
    System.out.println(abc);
}
}
