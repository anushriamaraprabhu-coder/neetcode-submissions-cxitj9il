class Solution {
    public String longestCommonPrefix(String[] strs) {

        if(strs==null || strs.length==0){return "";}

        StringBuilder sb=new StringBuilder();

        Arrays.sort(strs);

        char[]firstword=strs[0].toCharArray();
        char[]lastword=strs[strs.length-1].toCharArray();

        for(int i=0;i<Math.min(firstword.length,lastword.length);i++){

            if(firstword[i]!=lastword[i]){
                break;
            }
            sb.append(firstword[i]);
        }

        return sb.toString();
        
    }
}