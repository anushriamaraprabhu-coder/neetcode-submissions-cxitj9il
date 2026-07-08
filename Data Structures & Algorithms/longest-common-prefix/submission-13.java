class Solution {
    public String longestCommonPrefix(String[] strs) {

        String firstword=strs[0];

        for(int i=0;i<firstword.length();i++){
                for(int j=1;j<strs.length;j++){

                    char ch=firstword.charAt(i);
                    if(i>=strs[j].length() || strs[j].charAt(i)!=ch){
                        return firstword.substring(0,i);
                    }
                }
            
        }

        return firstword;
        
    }
}