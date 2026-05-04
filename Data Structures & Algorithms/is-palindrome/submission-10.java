class Solution {
    public boolean isPalindrome(String s) {

        //two pointer approach 

        if(s==null){return true;}

        int left=0;
       // int right=s.length()-1;
        String str=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int right=str.length()-1;
        
        while(left<right){

            if(str.charAt(left)!=str.charAt(right)){return false;}
            left++;
            right--;
        }

        return true;

        
    }
}
