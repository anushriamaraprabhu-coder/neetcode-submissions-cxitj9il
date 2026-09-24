class Solution {

    public String encode(List<String> strs) {

        StringBuilder sb=new StringBuilder();

        for(String word:strs){

            int len=word.length();
            sb.append(len).append("#").append(word);
        }

        return sb.toString();

    }

    public List<String> decode(String str) {


        List<String>list=new ArrayList<>();

        int i=0;

        while(i<str.length()){

            int j=i;

            while(str.charAt(j)!='#'){
                j++;
            }

            int len=Integer.parseInt(str.substring(i,j));

            int start=j+1;

            String s=str.substring(start,start+len);
            list.add(s);

            i=start+len;
        }

        return list;

    }
}
