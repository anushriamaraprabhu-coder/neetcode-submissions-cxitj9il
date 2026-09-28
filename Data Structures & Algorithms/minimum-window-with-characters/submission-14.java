class Solution {
    public String minWindow(String s, String t) {


        int reqdistinct=0;
        int[]required=new int[128];

        for(int right=0;right<t.length();right++){

            char ch=t.charAt(right);

            if(required[ch]==0){

                reqdistinct++;

            }

            required[ch]++;


        }


        int formed=0;
        int left=0;
        int minlen=Integer.MAX_VALUE;
        int minstart=0;

        int[]secondfreq=new int[128];

        for(int right=0;right<s.length();right++){

            char ch=s.charAt(right);

            secondfreq[ch]++;


            if(secondfreq[ch]==required[ch]){

                formed++;
            }

            while(formed==reqdistinct){

                int currlen=right-left+1;
                if(currlen<minlen){
                    minlen=currlen;
                    minstart=left;
                }

                char leftchar=s.charAt(left);

                secondfreq[leftchar]--;

                if(secondfreq[leftchar]<required[leftchar]){
                    formed--;
                }

                left++;
            }

            
        }

        return (minlen==Integer.MAX_VALUE ? "" : s.substring(minstart,minstart+minlen));
        
    }
}
