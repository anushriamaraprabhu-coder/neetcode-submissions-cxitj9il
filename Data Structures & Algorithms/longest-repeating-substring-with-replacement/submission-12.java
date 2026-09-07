class Solution {
    public int characterReplacement(String s, int k) {

        int left=0;
        int maxlen=0;
        int maxwindow=0;

        int[]freq=new int[26];

        for(int right=0;right<s.length();right++){

            char ch=s.charAt(right);

            freq[ch-'A']++;

            maxwindow=Math.max(maxwindow,freq[ch-'A']);

            if((right-left+1)-maxwindow>k){

                freq[s.charAt(left)-'A']--;
                left++;

            }

            int windowlen=right-left+1;
            maxlen=Math.max(maxlen,windowlen);


        }

        return maxlen;
        
    }
}
