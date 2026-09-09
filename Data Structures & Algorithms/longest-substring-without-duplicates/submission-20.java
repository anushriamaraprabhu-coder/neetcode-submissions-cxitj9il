class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character>set=new HashSet<>();

        int left=0;
        int maxlen=0;

        for(int right=0;right<s.length();right++){

            char ch=s.charAt(right);

            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }

            set.add(ch);

            int currentlen=right-left+1;

            maxlen=Math.max(currentlen,maxlen);
            
            
        }

        return maxlen;
        
    }
}
