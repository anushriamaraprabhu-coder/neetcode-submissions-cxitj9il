class Solution {
    public static boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }

        String s1=s.toLowerCase();
        String t1=t.toLowerCase();

        HashMap<Character,Integer>map=new HashMap<>();
        for(char ch:s1.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);

        }

        for(char ch:t1.toCharArray()){
            if(!map.containsKey(ch)||map.get(ch)==0){
                return false;
            }
            map.put(ch,map.get(ch)-1);
        }
        return true;

       
    }

    public static void main(String[]args){

        String s="racecar";
        String t="carrace";

        isAnagram(s,t);


        
    }
}
