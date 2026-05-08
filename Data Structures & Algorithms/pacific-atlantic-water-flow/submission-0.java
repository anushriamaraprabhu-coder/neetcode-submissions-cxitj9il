class Solution {

    //check all 4 directions 
          static int[][]directions={
            {-1,0},//up
            {1,0},//down
            {0,-1},//left
            {0,1}//right
         };

    public List<List<Integer>> pacificAtlantic(int[][] heights) {

        

        //List to store final result 

        List<List<Integer>>result=new ArrayList<>();

        //initialize the rows and columns 
        int rows=heights.length;
        int columns=heights[0].length;

        //matrix to track which cless reach both the pacific and atlantic ocean

        boolean[][]pacific=new boolean[rows][columns];
        boolean[][]atlantic=new boolean[rows][columns];

       //run dfs for pacific and atlantic
        for(int col=0; col<columns;col++){
            //dfs for pacific top row
            dfs(0,col,pacific,heights);
            //dfs for atlantic bottom row
            dfs(rows-1,col,atlantic,heights);
        }
        //for left column
        for(int r=0;r<rows;r++){
            //dfs for pacific left row
            dfs(r,0,pacific,heights);
            //dfs for atlantic right column
            dfs(r,columns-1,atlantic,heights);
        }

        //dfs for all reachable cells
        for(int r=0;r<rows;r++){
            for(int c=0;c<columns;c++){
                if(pacific[r][c] && atlantic[r][c]){
                    result.add(Arrays.asList(r,c));
                }
            }
        }

        return result;
       
    }

    private void dfs(int r,int c,boolean[][]visited,int[][]heights){

        //mark cell as visited as true which means this cell can reach the ocean

        visited[r][c]=true;

        //take matrix dimensions
        int row=heights.length;
        int column=heights[0].length;

        //loop through all 4 directions
        for(int[]d:directions){

            //calculate neighbour rows and columns
            int newrow=r+d[0];
            int newcolumn=c+d[1];

            //bounday checks
            if(newrow>=0 && newrow<row
               && newcolumn>=0 && newcolumn<column
               && !visited[newrow][newcolumn]
               && heights[newrow][newcolumn]>=heights[r][c]){
                dfs(newrow,newcolumn,visited,heights);
               }
        }
    }
}
