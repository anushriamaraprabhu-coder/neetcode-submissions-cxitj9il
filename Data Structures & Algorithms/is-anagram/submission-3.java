class Solution {
    public static boolean isAnagram(String s, String t) {

        String s1=s.toLowerCase();
        String t1=t.toLowerCase();

        if(s.length()!=t.length()){return false;}

        HashMap<Character,Integer>map=new HashMap<>();

        //adding characters to string 1

        for(char ch:s1.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        //removing characters from second string to balance it outhis

        for(char ch:t1.toCharArray()){

            if(!map.containsKey(ch) || map.get(ch)==0){
                return false;
            }
            map.put(ch,map.get(ch)-1);
        }

        return true;
    }

    public static void main(String[]args){

        String s="racecar";
        String t="carracE";

        isAnagram(s,t);

    }
}
