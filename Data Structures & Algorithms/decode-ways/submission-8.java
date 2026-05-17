class Solution {
    public int numDecodings(String s) {

        //TC: O(n)
        //SC: O(n)

        int len=s.length();
        int[]dp=new int[len+1];
        dp[0]=1;
        dp[1]=s.charAt(0)=='0'? 0: 1;

        for(int i=2;i<=len;i++){

            int onedigit=Integer.valueOf(s.substring(i-1,i));
            int twodigit=Integer.valueOf(s.substring(i-2,i));

            if(onedigit>=1){
                dp[i]+=dp[i-1];
            }
            
            if(twodigit>=10 && twodigit<=26){
                dp[i]+=dp[i-2];
            }
        }

        return dp[len];


        
    }
}
