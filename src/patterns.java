public class patterns{
    public static void main(String[] args){
        int a=5;
        for(int i=0;i<a;++i){
            for(int j=0;j<a;++j){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(int i=0;i<a;++i){
            for(int j=0;j<=i;++j)
                System.out.print(" * ");
            System.out.println();
        }
        System.out.println();
        for(int i=a-1;i>=0;--i){
            for(int j=0;j<=i;++j)
                System.out.print(" * ");
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<5;++i){
            for(int j=0;j<5;++j){
                if(i<=j)
                    System.out.print(" * ");
                else
                    System.out.print("   ");

            }
            System.out.println();
        }
        for(int i=0;i<5;++i){
            for(int j=0;j<5;++j){
                if(i+j>=4)
                    System.out.print(" * ");
                else
                    System.out.print("   ");

            }
            System.out.println();

        }
        pyramid(5);

    }
    public static void pyramid(int num){
        int stars=2*num,space=num-1;
        int k=1;
        for(int i=0;i<num;++i){
            for(int j=space;j>0;--j){
                System.out.print("   ");
            }
            if(space!=0)
                --space;
        for(int j=1;j<=k;j+=1){
            System.out.print(" * ");
        }if(k!=stars)
                k+=2;
        System.out.println();
    }
}
}