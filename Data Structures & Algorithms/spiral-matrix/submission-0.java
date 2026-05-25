class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer>list=new ArrayList<>();

        if(matrix==null || matrix.length==0){return list;}

        //Initialize top, bottom,left and right

        int top=0;
        int bottom=matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;


        
         while(top<=bottom && left<=right){

            //Traverse right

            for(int j=left;j<=right;j++){
                list.add(matrix[top][j]);
            }

            top++;

            //traverse bottom
            for(int i=top;i<=bottom;i++){
                list.add(matrix[i][right]);
            }

            right--;

            //traverse left

            if(top<=bottom){
                for(int j=right;j>=left;j--){
                    list.add(matrix[bottom][j]);
                }
                bottom--;
            }

            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    list.add(matrix[i][left]);
                }

                left++;
            }



            
         }

         return list;
        
    }
}
