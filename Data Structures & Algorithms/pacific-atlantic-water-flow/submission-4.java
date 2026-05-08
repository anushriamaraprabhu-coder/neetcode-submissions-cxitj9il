class Solution {



    static int[][]directions={
        {-1,0},
        {1,0},
        {0,-1},
        {0,1}
    };
    public List<List<Integer>> pacificAtlantic(int[][] heights) {

        // THE TOTAL TIME COMPLEXITY= O(M*N)
             // A. DFS OF PACIFIC=O(M*N) B. DFS OF ATLANTIC=O(M*N) C.DFS OF INTERSECTION=O(M*N)
        // TOTAL SPACE COMPLEXITY= dfs of visited pacific and atlantic arrays, worst case recursion = O(m*n)


        List<List<Integer>>result=new ArrayList<>();

        int row=heights.length;
        int column=heights[0].length;

        boolean[][]pacific=new boolean[row][column];
        boolean[][]atlantic=new boolean[row][column];

        for(int col=0;col<column;col++ ){
            dfs(0,col,pacific,heights);
            dfs(row-1,col,atlantic,heights);
        }

        for(int ro=0;ro<row;ro++){
            dfs(ro,0,pacific,heights);
            dfs(ro,column-1,atlantic,heights);
        }

        for(int r=0;r<row;r++){
            for(int c=0;c<column;c++){
                if(pacific[r][c]&&atlantic[r][c]){
                    result.add(Arrays.asList(r,c));
                }
            }
        }
        return result;

        
    }

    private void dfs(int r,int c,boolean[][]visited,int[][]heights){

        visited[r][c]=true;

        int row=heights.length;
        int column=heights[0].length;

        for(int[]d:directions){
            int newrow=r+d[0];
            int newcolumn=c+d[1];

            if(newrow>=0 && newrow<row && newcolumn>=0 && newcolumn<column && !visited[newrow][newcolumn] && 
            heights[newrow][newcolumn]>=heights[r][c]){
                dfs(newrow,newcolumn,visited,heights);
            }
        }
    }
}
