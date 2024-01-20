package Assignment;
import java.util.*;
public class Subset_problem_Recursion {
    public static void main(String args[]) {
        Scanner input= new Scanner(System.in) ;
        int n= input.nextInt() ;
        int Aiop[]= new int[n] ;
        for(int i=0; i<n; i++){
            Aiop[i]=input.nextInt() ;
        }

        int target=input.nextInt() ;
        List<Integer>ans= new ArrayList<>() ;

        findSubset(n, Aiop, target, 0, ans, 0); ;
        System.out.println() ;
        System.out.print(funTionCount(n, Aiop, target, 0, ans, 0)) ;

    }
    public static void findSubset(int n, int[] Array, int get, int initial, List<Integer>ans, int karoSum){
            if(initial==n){
                if(karoSum==get){
                    for(int i=0; i<ans.size(); i++){
                        System.out.print(ans.get(i) + " ") ;
                    }
                    System.out.print(" ") ;
                }
                return;
            }
            karoSum+= Array[initial] ;
            ans.add(Array[initial]) ;

            findSubset(n, Array, get, initial+1, ans, karoSum); ;
            karoSum-=Array[initial] ;
            ans.remove(ans.size()-1) ;
            findSubset(n, Array, get, initial+1, ans, karoSum) ;
        }

        public static int funTionCount(int n, int[] a, int target, int initial, List<Integer>ans, int sum){
            if(initial==n){
                if(sum==target){
                    return 1 ;
                }
                return 0;

            }
            sum+= a[initial] ;
            ans.add(a[initial]) ;
            int first= funTionCount(n, a, target, initial+1, ans, sum) ;
            sum-=a[initial] ;
            ans.remove(ans.size()-1) ;
            int second= funTionCount(n, a, target, initial+1, ans, sum) ;

            return first + second ;
        }


    }
