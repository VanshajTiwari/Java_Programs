public class Kartik_Bhaiya_And_String {
    public static void main(String[] args) {
        String rs="abba";
        int flipa=findMaxStr(rs,2,'a');
        int flipb=findMaxStr(rs,2,'b');
        System.out.println(Math.max(flipa,flipa));
    }

    private static int findMaxStr(String Operand, int k, char ch) {
        int si=0,ei=0,count=0;
        int ans=0;
        while(ei<Operand.length()){
            //create window
            if(Operand.charAt(ei)==ch){
                count++;
            }
            //Reduce Window
            while(count>k && si<=ei){
                if(Operand.charAt(si)==ch){
                    --count;
                }
                ++si;
            }
            //ans
            ans=Math.max(ans,ei-si+1);
            ++ei;
        }
        return ans;
    }
}
