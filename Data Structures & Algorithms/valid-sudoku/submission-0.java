class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashSet<Character>[]row=new HashSet[9];
        HashSet<Character>[]column=new HashSet[9];
        HashSet<Character>[]boxes=new HashSet[9];

        for(int i=0;i<9;i++){
            row[i]=new HashSet<>();
            column[i]=new HashSet<>();
            boxes[i]=new HashSet<>();

        }

        for(int r=0;r<9;r++){
            for(int c=0;c<9;c++){

                char ch=board[r][c];

                if(ch=='.'){
                    continue;
                }

                int boxindex=(r/3)*3+(c/3);

                if(row[r].contains(ch)
                || column[c].contains(ch)
                || boxes[boxindex].contains(ch)){
                    return false;
                }

                row[r].add(ch);
                column[c].add(ch);
                boxes[boxindex].add(ch);
            }


        }

        return true;
        
    }
}
