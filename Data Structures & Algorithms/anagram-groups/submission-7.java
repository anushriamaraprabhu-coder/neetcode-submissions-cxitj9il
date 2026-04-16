class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        if(strs==null || strs.length==0){return new ArrayList<>();}

        HashMap<String,List<String>>map=new HashMap<>();

        for(String str:strs){
            String freqString=getFrequencyOfStrings(str);

            if(map.containsKey(freqString)){
                map.get(freqString).add(str);
            }

            else{
                List<String>list=new ArrayList<>();
                list.add(str);
                map.put(freqString, list);
            }

        }

        return new ArrayList<>(map.values());
        
    }

    private String getFrequencyOfStrings(String s){

        int[]freq=new int[26];
        
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }

        StringBuilder sb=new StringBuilder();
        char ch='a';
        for(int i:freq){
            sb.append(ch);
            sb.append(i);
        }

        return sb.toString();
    }
}
