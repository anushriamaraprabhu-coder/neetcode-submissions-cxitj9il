class Solution {
    public String longestPalindrome(String s) {

        if(s==null || s.length()==0){return null;}

        int start=0;
        int end=0;

        for(int i=0;i<s.length();i++){

            int oddlength=expandfromcenter(s,i,i);
            int evenlength=expandfromcenter(s,i,i+1);

            int currentlen=end-start+1;

            int maxlen=Math.max(oddlength,evenlength);

            if(maxlen>currentlen){

                start=i-(maxlen-1)/2;
                end=i+(maxlen)/2;
            }
        }

        return s.substring(start,end+1);


        
    }

    private int expandfromcenter(String s,int left,int right){

        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }

        return right-left-1;
    }

    
}
