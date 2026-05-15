class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {


        //first take the word dictionary in hashset for O(1) lookup
        HashSet<String>wordset=new HashSet(wordDict);

        //find the maxlength to calculate how far back you need to go
        int maxlength=0;
        for(String word:wordDict){
            maxlength=Math.max(maxlength,word.length());
        }

        int len=s.length();
        boolean[]dp=new boolean[len+1];
        //base case
        dp[0]=true;

        for(int i=1;i<=len;i++){

            //check prefixes upto maxlength
            for(int j=i-1;j>=Math.max(0,i-maxlength);j--){
                if(dp[j]&& wordset.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }
        }

        return dp[len];




        
        
    }
}
