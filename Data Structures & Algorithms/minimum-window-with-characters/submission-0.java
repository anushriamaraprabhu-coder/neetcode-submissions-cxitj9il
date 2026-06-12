class Solution {
    public String minWindow(String s, String t) {

        if(s.length()<t.length()){return "";}

        int[]freq=new int[128];
        
        
        for(char ch:t.toCharArray()){
            freq[ch]++;
        }

        int left=0;
        int count=t.length();
        int minlen=Integer.MAX_VALUE;
        int start=0;

        for(int right=0;right<s.length();right++){
            
            char charAtRight=s.charAt(right);

            if(freq[charAtRight]>0){
                
                count--;
            }

            freq[charAtRight]--;
        

        while(count==0){

            if(right-left+1<minlen){

                minlen=right-left+1;
                start=left;
            }

            char charAtLeft=s.charAt(left);

            freq[charAtLeft]++;

            if(freq[charAtLeft]>0){
                count++;
            }

            left++;
        }
            
        }

        return minlen==Integer.MAX_VALUE? "" : s.substring(start,start+minlen);
        
    }
}
