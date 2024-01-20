public class Sumofoddplacedandevenplaceddigits {
   public static void main(String[] args){
    int num=123;
    int sume=0,sumo=0,rev=0;
    while(num>0){
        int c=num%10;
        rev=rev*10+c;
        num/=10;
    }
    int count=0;
    while(rev>0){
        int c=rev%10;
        ++count;
        if(count%2!=0)
            sume+=c;
        else
            sumo+=c;
        rev/=10;
    }
       System.out.print(sume+"\n"+sumo);
   }
}
