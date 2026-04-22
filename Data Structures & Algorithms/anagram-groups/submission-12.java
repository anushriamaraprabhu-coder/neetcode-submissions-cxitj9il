class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>>map=new HashMap<>();

        if(strs==null || strs.length==0){return new ArrayList<>();}

        for(String str:strs){
            String freqString= getFrequencyOfString(str);
            if(map.containsKey(freqString)){
                map.get(freqString).add(str);
            }

            else{

                //If the map dosent contain this freq string then we will add the nee freq string to our map 

                List<String>list=new ArrayList<>();
                list.add(str);
                map.put(freqString, list);
            }
        }

        return new ArrayList<>(map.values());
        
    }

    private String getFrequencyOfString(String str){

        int[]freq=new int[26];
        for(char ch:str.toCharArray()){

            freq[ch-'a']++;

        }

        //building our output 

        StringBuilder sb=new StringBuilder("");
        char ch='a';

        for(int i:freq){
            sb.append(ch);
            sb.append(i);
        }

        return sb.toString();

    }
}
