class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int left=0;
        int[]s1freq=new int[26];
        int[]s2freq=new int[26];

        for(int right=0;right<s1.length();right++){
            
            char ch=s1.charAt(right);
            
            s1freq[ch-'a']++;

        }
           for(int right=0;right<s2.length();right++){
            
            char ch=s2.charAt(right);
            
            s2freq[ch-'a']++;

            if(right-left+1>s1.length()){
                
                s2freq[s2.charAt(left)-'a']--;

                left++;

            }

            if(right-left+1==s1.length() && Arrays.equals(s1freq,s2freq)){

                return true;
            }


        }

        return false;


        
    }
}
