class Solution {
    public String foreignDictionary(String[] words) {

        Map<Character,Set<Character>>graph=new HashMap<>();
        Map<Character,Integer>indegree=new HashMap<>();


        //Initialize unique chars/nodes

        for(String word:words){
            for(char ch:word.toCharArray()){
            graph.putIfAbsent(ch,new HashSet<>());
            indegree.putIfAbsent(ch,0);
        }
        }

        for(int i=0;i<words.length-1;i++){

            String word1=words[i];
            String word2=words[i+1];

            //comapare

            if(word1.length()>word2.length() && word1.startsWith(word2)){return "";}

            int minlen=Math.min(word1.length(),word2.length());

            for(int j=0;j<minlen;j++){

                char ch1=word1.charAt(j);
                char ch2=word2.charAt(j);

                if(ch1!=ch2){

                    if(!graph.get(ch1).contains(ch2)){
                        graph.get(ch1).add(ch2);
                        indegree.put(ch2,indegree.get(ch2)+1);
                    }

                    break;
                }
            }
        }

        Queue<Character>queue=new LinkedList<>();

        for(char ch:indegree.keySet()){
            if(indegree.get(ch)==0){
                queue.add(ch);
            }
        }

        StringBuilder sb=new StringBuilder();

        while(!queue.isEmpty()){

            char current=queue.poll();
            sb.append(current);

            for(char neighbour:graph.get(current)){
                indegree.put(neighbour,indegree.get(neighbour)-1);

                if(indegree.get(neighbour)==0){
                    queue.add(neighbour);
                }
            }
        }

        if(sb.length()!=indegree.size()){return "";}

        return sb.toString();

      
    }
}
