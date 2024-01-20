public class prac {
    public static void main(String[] args) {
        //Case 1
        P a = new P();
        System.out.println(a);
        System.out.println(a.data);
        a.fun();

        //Case 2
        P ac = new C();
        System.out.println(a.data);
        ac.fun();// this always Accesss the  method of NEw Class
        ac.fun2();
        ac.fun();


        //case 3
      //  C ab=new P();    Not Allowed
        //Case 4

    }

}
