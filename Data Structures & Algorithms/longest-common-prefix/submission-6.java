class Solution {
    public String longestCommonPrefix(String[] strs) {

        //strs=["clue","clot","clap"]

        if(strs==null || strs.length==0){return "";}

        String first=strs[0]; //reference string. here o/p is "clue"

        for(int i=0;i<first.length();i++){
            char ch=first.charAt(i);//extract each character of the reference string. O/P=['c','l','u','e']

        

        //start comparing with rest of the strings

        for(int j=1;j<strs.length;j++){
            if(i>=strs[j].length() || strs[j].charAt(i)!=ch){
                return first.substring(0,i);
            }
        }
        }

        return first;


        
    }
}