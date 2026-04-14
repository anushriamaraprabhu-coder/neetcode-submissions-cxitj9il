class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        if(strs==null || strs.length==0){
            return new ArrayList<>();
        }

        HashMap<String,List<String>>map=new HashMap<>();
        
        for(String s:strs){
            String freqString=getStringfrequency(s);

            if(map.containsKey(freqString)){
                map.get(freqString).add(s);
            }

            else{

                List<String>list=new ArrayList<>();
                list.add(s);
                map.put(freqString, list);
            }
        }

        return new ArrayList<>(map.values());
        
    }

    private String getStringfrequency(String str){

        int[]freq=new int[26];

        for(char ch:str.toCharArray()){
            freq[ch-'a']++;
        }

        StringBuilder sb=new StringBuilder("");
        char ch='a';
        for(int i:freq){
            sb.append(ch);
            sb.append(i);

        }
        return sb.toString();
    }
}
