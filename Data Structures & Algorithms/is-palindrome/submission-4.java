class Solution {
    public static boolean isPalindrome(String s) {

        String rev="";
        String str=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        if(str.length()==0)
        return true;

        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
            if(rev.equals(str) ){
                return true;
            }
        }
        return false;
    
    }

    public static void main(String[]args){

        String s="Was it a car or a cat I saw?";
        isPalindrome(s);

    }
}
