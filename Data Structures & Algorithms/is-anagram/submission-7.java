class Solution {
    public boolean isAnagram(String s, String t) {

        String str=s.toLowerCase();
        String t1=t.toLowerCase();

        if(s.length()!=t.length()){return false;}

        //add elements to string1`

        HashMap<Character,Integer>map=new HashMap<>();

        for(char ch:str.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
                
        }

        //remove elements from second string

        for(char ch:t1.toCharArray()){
            if(!map.containsKey(ch)|| map.get(ch)==0){
                return false;
            }

            map.put(ch, map.get(ch)-1);
        }

        return true;

    }
}
