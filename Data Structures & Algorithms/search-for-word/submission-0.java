class Solution {
    public boolean exist(char[][] board, String word) {

        //Start with row and column 
        for(int i=0;i<board.length;i++){

            //column 

            for(int j=0;j<board[0].length;j++){

                if(dfs(board,word,i,j,0)){
                    return true;
                }
            }
        }

        return false;
        
    }

    private boolean dfs(char[][]board,String word,int i,int j,int index){

        //if word is completed 
        if(index==word.length()){return true;}

        //Invalid or wrong path found 
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]!=word.charAt(index)){
            return false;
        }

        //mark visited 
        char temp=board[i][j];
        board[i][j]='#';

        //check all directions 
        boolean found=
                dfs(board,word,i+1,j,index+1)||
                dfs(board,word,i-1,j,index+1)||
                dfs(board,word,i,j+1,index+1)||
                dfs(board,word,i,j-1,index+1);

                //backtrack 
                board[i][j]=temp;

                return found;




    }
}
