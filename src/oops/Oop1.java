package oops;
import java.util.*;
public class Oop1 {
    public static void  main(String[] args){

            Student var1=new Student();
            Student.variable=11;
            var1.insert(1,"Vanshaj",13);
            var1.show();

            System.out.println(Student.variable=11);
            Oop1 obj=new Oop1();
            obj.hero();
            obj.me();
    }
    void hero(){
        me();
        System.out.println("hello");
    }
    static void me(){
        System.out.println("vanshaj");
    }

}

