class Solution {
    public int countSubstrings(String s) {

        //time complexity: O(n2): worst case you have aaaaaa then you need to check 1+2+3+...n
        //space complexity:O(1)

        int count=0;

        for(int i=0;i<s.length();i++){

        count+=expandcenter(s,i,i);
        count+=expandcenter(s,i,i+1);
        }

        return count;      
    }

    private int expandcenter(String str,int left,int right){

        int count=0;

        while(left>=0 && right<str.length() && str.charAt(left)==str.charAt(right)){
            count++;
            left--;
            right++;
        }

        return count;
    }
}
