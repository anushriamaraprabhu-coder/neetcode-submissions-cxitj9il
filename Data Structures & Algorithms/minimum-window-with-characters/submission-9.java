class Solution {
    public String minWindow(String s, String t) {

        int[]freq=new int[128];

        for(char ch:t.toCharArray()){
            freq[ch]++;
        }

        int left=0;
        int start=0;
        int minlen=Integer.MAX_VALUE;
        int count=t.length();

        for(int right=0;right<s.length();right++){

            char charatright=s.charAt(right);

            if(freq[charatright]>0){

                count--;

            }

            freq[charatright]--;

            while(count==0){

                if(right-left+1<minlen){
                    minlen=right-left+1;
                    start=left;
                }

                char charatleft=s.charAt(left);

                freq[charatleft]++;

                if(freq[charatleft]>0){
                    count++;
                }
                left++;
            }
        }

        return minlen==Integer.MAX_VALUE ? "" : s.substring(start,start+minlen);

        
    }
}
