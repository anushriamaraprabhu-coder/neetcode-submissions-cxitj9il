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

            char charright=s.charAt(right);

            if(freq[charright]>0){
                count--;
            }

            freq[charright]--;

            while(count==0){

                char charleft=s.charAt(left);

                if(right-left+1<minlen){
                    minlen=right-left+1;
                    start=left;
                }

                freq[charleft]++;

                if(freq[charleft]>0){
                    count++;
                }

                 left++;
            }

           

        }

        return minlen==Integer.MAX_VALUE ? "" : s.substring(start,start+minlen);
        
    }
}
