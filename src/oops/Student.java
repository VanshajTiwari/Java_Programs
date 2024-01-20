package oops;
public class Student{
    int rollNo;
    String name;
    int class_;
    static int variable;
    public Student(){
        rollNo=0;
        name="";
        class_=0;
        variable=10;
    }
   public void insert(int rollNo,String name,int class_){
        this.rollNo=rollNo;
        this.name=name;
        this.class_=class_;
        this.variable=0;
    }
    void show(){
        System.out.println("Roll No. : "+rollNo+"\nName of Student :"+name+"\nClass :"+class_+"\nvariable"+variable);
    }
}