package Recursion;
import java.util.*;
public class TowerOfHonai {
        public  static void towerOfHanoi(int disk, char poleOfrom, char polrOmain, char auximain){
            if (disk == 1)
            {
                System.out.println("Moving ring "+disk+" from " + poleOfrom + " to " + polrOmain);
                return;
            }
            towerOfHanoi(disk - 1, poleOfrom, auximain, polrOmain);

            System.out.println("Moving ring " + disk + " from " + poleOfrom + " to " + polrOmain);
            towerOfHanoi(disk - 1, auximain, polrOmain, poleOfrom);
        }

        public static void main(String argvs[])
        {
            Scanner input=new Scanner(System.in);
            int disk=input.nextInt();
            char poling1 = 'A';
            char poiling2 = 'B';
            char poling3 = 'C';

            towerOfHanoi( disk, poling1, poiling2, poling3 );

        }
    }

