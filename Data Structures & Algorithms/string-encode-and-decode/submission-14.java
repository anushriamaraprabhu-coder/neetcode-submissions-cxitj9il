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

        List<String>result=new ArrayList<>();

        int i=0;

        while(i<str.length()){
            int j=i;

            while(str.charAt(j)!='#'){
                j++;
            }
            int len=Integer.parseInt(str.substring(i,j));

        int start=j+1;
        int end=j+1+len;

        String word=str.substring(start,end);

        result.add(word);

        i=end;
        }

        return result;

        

    }
}
