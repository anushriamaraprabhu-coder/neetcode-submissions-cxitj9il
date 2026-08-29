class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        //List<List<String>>list=new ArrayList<>();

        HashMap<String,List<String>>map=new HashMap<>();

        for(String word:strs){

            int[]freq=new int[26];

            for(int i=0;i<word.length();i++){

                char ch=word.charAt(i);

                freq[ch-'a']++;
            }

            StringBuilder sb=new StringBuilder();

            for(int i=0;i<freq.length;i++){

                sb.append(freq[i]);
                sb.append("#");
            }

            String key=sb.toString();

            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }

            map.get(key).add(word);


        }

        return new ArrayList<>(map.values());
        
    }
}
