class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){return false;}

        String s1=s.toLowerCase();
        String t1=t.toLowerCase();

        HashMap<Character,Integer>map=new HashMap<>();

        //Add characters to string1 i.e increasing frequency 

        for(char ch:s1.toCharArray()){

            map.put(ch, map.getOrDefault(ch,0)+1);

        }

        //check character count of second string

        for(char ch:t1.toCharArray()){

            //check if map dosent contain that character/ char count has exhausted 

            if(!map.containsKey(ch) || map.get(ch)==0){
                return false;
            }

            //Reduce the character count from map 
            map.put(ch,map.get(ch)-1);
        }

        return true;

    }
}
