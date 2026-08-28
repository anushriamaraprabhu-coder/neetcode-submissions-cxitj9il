class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashSet<Character>[]rows=new HashSet[9];
        HashSet<Character>[]columns=new HashSet[9];
        HashSet<Character>[]boxes=new HashSet[9];

        for(int i=0;i<9;i++){

            rows[i]=new HashSet<>();
            columns[i]=new HashSet<>();
            boxes[i]=new HashSet<>();

        }

            for(int r=0;r<9;r++){
                for(int c=0;c<9;c++){

                    char ch=board[r][c];

                    if(ch=='.'){continue;}

                    int boxindex=(r/3)*3+(c/3);

                    if(rows[r].contains(ch)
                    ||columns[c].contains(ch)
                    ||boxes[boxindex].contains(ch)){
                        return false;
                    }

                    rows[r].add(ch);
                    columns[c].add(ch);
                    boxes[boxindex].add(ch);
                }
            }

          return true;
        
    }
}
