class Solution {
    public boolean isPalindrome(String s) {

        String str=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        if(str.length()==0){return true;}

        String rev="";

        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);

            if(rev.equals(str)){return true;}
        }

        return false;
        
    }
}
