class Solution {
    public String longestPalindrome(String s) {

        //time complexity: O(n2);
        //space complexity: O(1);

        if(s==null || s.length()==0){return s;}

        int start=0;
        int end=0;

        for(int i=0;i<s.length();i++){

            int oddlength=expandcenter(s,i,i);
            int evenlength=expandcenter(s,i,i+1);

            int maxlength=Math.max(oddlength,evenlength);

            if(maxlength>end-start+1){

                start=i-(maxlength-1)/2;
                end=i+(maxlength)/2;
            }
        }

        return s.substring(start,end+1);
        
    }

    private int expandcenter(String s,int left,int right){

        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){

            left--;
            right++;
        }
        return right-left-1;
    }

    

    
}
