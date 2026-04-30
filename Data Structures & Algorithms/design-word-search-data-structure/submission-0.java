class WordDictionary {

    private class TrieNode{

        TrieNode[]children;
        boolean isEnd;

        TrieNode(){
            children=new TrieNode[26];
            isEnd=false;
        }
    }

    private TrieNode root;

    public WordDictionary() {

        root=new TrieNode();

    }

    public void addWord(String word) {

        TrieNode node=root;
        for(char ch:word.toCharArray()){
            int index=ch-'a';
            if(node.children[index]==null){
                node.children[index]=new TrieNode();
            }
            node=node.children[index];
        }

        node.isEnd=true;

    }

    public boolean search(String word) {

        //checking for the word, first character of the word from the root. 

        return dfs(word,0,root);

    }
    
    //helper function for dfs 
    private boolean dfs(String word,int i, TrieNode node){
         
         //if no match found dead path 
        if(node==null){return false;}
        

        //early success return the result 
        if(i==word.length()){
            return node.isEnd;
        }

        char ch=word.charAt(i);

        //lets check for . scenario 
        if(ch=='.'){

            //try all possible characters 
            for(int j=0;j<26;j++){
                if(node.children[j]!=null){
                    if(dfs(word,i+1,node.children[j])){
                        return true;
                    }
                }
            }
            return false;
        }
        else{

            int index=ch-'a';
            return(dfs(word,i+1,node.children[index]));
        }

    }
}
