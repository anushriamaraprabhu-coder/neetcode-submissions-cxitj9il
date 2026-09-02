class Solution {
    public String mergeAlternately(String word1, String word2) {


        StringBuilder sb=new StringBuilder();

        char[]ch1=word1.toCharArray();
        char[]ch2=word2.toCharArray();

        int word1pointer=0;
        int word2pointer=0;

        while(word1pointer< word1.length() && word2pointer<word2.length()){

            sb.append(ch1[word1pointer]).append(ch2[word2pointer]);
            word1pointer++;
            word2pointer++;

        }

        while(word1pointer<word1.length()){

            sb.append(ch1[word1pointer]);

            word1pointer++;


        }

        while(word2pointer<word2.length()){

            sb.append(ch2[word2pointer]);
            word2pointer++;


        }

        return sb.toString();

        
    }
}