class Solution {
    public int numDecodings(String s) {

        if(s.charAt(0)=='0'){return 0;}

        int prev2=1;
        int prev1=1;

        for(int i=2;i<=s.length();i++){

            int current=0;

            int onedigit=Integer.valueOf(s.substring(i-1,i));
            int twodigit=Integer.valueOf(s.substring(i-2,i));

            if(onedigit>=1){
                current+=prev1;
            }
            if(twodigit>=10 && twodigit<=26){
                current+=prev2;

            }

            prev2=prev1;
            prev1=current;
        }

        return prev1;
        
    }
}
