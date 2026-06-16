class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {

        HashSet<String>set=new HashSet<>(wordDict);
        int maxlen=0;

        for(String word:wordDict){
            maxlen=Math.max(maxlen,word.length());
        }

        int len=s.length();
        boolean[]dp=new boolean[len+1];
        dp[0]=true;

        for(int i=1;i<=len;i++){
            for(int j=i-1;j>=Math.max(0,i-maxlen);j--){
                if(dp[j] && set.contains(s.substring(j,i))){
                    dp[i]=true;
                }
            }
        }

        return dp[len];
        
    }
}
