class Solution {
    public String minWindow(String s, String t) {

        int[]required=new int[128];
        int requireddistinct=0;

        for(int i=0;i<t.length();i++){

            char ch=t.charAt(i);

            if(required[ch]==0){
                requireddistinct++;
            }

            required[ch]++;

        }

        

        int formed=0;
        int left=0;

        int minlen=Integer.MAX_VALUE;
        int start=0;

        int[]currentwindow=new int[128];

        for(int right=0;right<s.length();right++){

            char ch=s.charAt(right);

            currentwindow[ch]++;

            if(required[ch]>0 && currentwindow[ch]==required[ch]){
                formed++;
            }

            while(formed==requireddistinct){

                int windowlen=right-left+1;

                if(windowlen<minlen){
                    minlen=windowlen;
                    start=left;
                }

                char leftch=s.charAt(left);

                currentwindow[leftch]--;

                if(required[leftch]>0 && currentwindow[leftch]<required[leftch]){
                    formed--;
                }

                left++;
            }
        }

        if(minlen==Integer.MAX_VALUE){
            return "";
        }

        return s.substring(start,start+minlen);


        
    }
}
