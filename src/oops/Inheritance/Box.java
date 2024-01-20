package oops.Inheritance;

public class Box {
    double l,h,w;
    Box(){
        this.l=-1;
        this.h=-1;
        this.w=-1;
    }
    //cube
    Box(double side){
        this.w=side;
        this.l=side;
        this.h=side;
    }
    //
    Box(double w,double l,double h){
        this.w=w;
        this.l=l;
        this.h=h;
    }
    Box(Box old){
        this.h=old.h;
        this.l=old.l;
        this.w=old.w;
    }
    public void information(){
        System.out.println("Running the Box");
    }

    public static void main(String[] args) {
        Box box=new Box(2,1,2);
        System.out.println(box.l+" "+box.h+" "+box.w);
        box.information();
    }
}
