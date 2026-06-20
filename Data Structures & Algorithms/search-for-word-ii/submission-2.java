class Solution {

    class TrieNode{

        TrieNode[]children=new TrieNode[26];
        String word;
    }
    public List<String> findWords(char[][] board, String[] words) {

        TrieNode root=buildTrie(words);

        List<String>list=new ArrayList<>();

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                dfs(board,i,j,root,list);
            }
        }

        return list;
        
    }

    private void dfs(char[][]board,int i,int j,TrieNode node,List<String>list){

        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]=='#'){
            return;
        }

        char ch=board[i][j];

        TrieNode next=node.children[ch-'a'];

        if(next==null){return;}

        if(next.word!=null){
            list.add(next.word);
            next.word=null;
        }

        board[i][j]='#';

        dfs(board,i+1,j,next,list);
        dfs(board,i-1,j,next,list);
        dfs(board,i,j+1,next,list);
        dfs(board,i,j-1,next,list);

        board[i][j]=ch;
    }

    private TrieNode buildTrie(String[]words){

        TrieNode root=new TrieNode();

        for(String word:words){

            TrieNode curr=root;

            for(char ch:word.toCharArray()){

                if(curr.children[ch-'a']==null){
                    curr.children[ch-'a']=new TrieNode();
                }

                curr=curr.children[ch-'a'];
            }

            curr.word=word;


        }

        return root;
    }
}
