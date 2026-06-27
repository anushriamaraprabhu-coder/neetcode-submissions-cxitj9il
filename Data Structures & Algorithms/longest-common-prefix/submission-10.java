class Solution {
    public String longestCommonPrefix(String[] strs) {

        if(strs==null || strs.length==0){return null;}

        String first=strs[0];

        for(int i=0;i<first.length();i++){
            for(int j=1;j<strs.length;j++){
                char ch=first.charAt(i);
                if(i>=strs[j].length() || strs[j].charAt(i)!=ch){
                    return first.substring(0,i);
                }
            }
        }

        return first;

        
    }
}