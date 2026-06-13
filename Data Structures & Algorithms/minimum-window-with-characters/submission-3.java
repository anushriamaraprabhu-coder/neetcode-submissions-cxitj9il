class Solution {
    public String minWindow(String s, String t) {

        int[]freq=new int[128];

        for(char ch:t.toCharArray()){
            freq[ch]++;
        }

        int left=0;
        int minlen=Integer.MAX_VALUE;
        int start=0;
        int count=t.length();

        for(int right=0;right<s.length();right++){

            char rightchar=s.charAt(right);
            if(freq[rightchar]>0){
                count--;
            }

            freq[rightchar]--;

            while(count==0){

                if(right-left+1<minlen){
                    minlen=right-left+1;
                    start=left;
                }

                char leftchar=s.charAt(left);
                freq[leftchar]++;
                if(freq[leftchar]>0){
                    count++;
                }

                left++;
                

            }
        }

        return minlen==Integer.MAX_VALUE ? "" : s.substring(start,start+minlen);
        
    }
}
