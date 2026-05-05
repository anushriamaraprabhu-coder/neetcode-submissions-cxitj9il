class Solution {
    public int numIslands(char[][] grid) {


        //doing some sanity checks for the testcases
        if(grid==null || grid.length==0 || grid[0].length==0){return 0;}

        int noOfIslands=0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){

                if(grid[i][j]=='1'){
                    dfs(grid,i,j);
                    noOfIslands++;
                }
                
            }
            
        }

        return noOfIslands;
        
    }

    private void dfs(char[][]grid,int i,int j){

        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]=='0'){
            return;
        }

        //lock the cell
        grid[i][j]='0';

        //use dfs recursively

        dfs(grid,i+1,j);
         dfs(grid,i-1,j);
          dfs(grid,i,j+1);
           dfs(grid,i,j-1);
    }
}
