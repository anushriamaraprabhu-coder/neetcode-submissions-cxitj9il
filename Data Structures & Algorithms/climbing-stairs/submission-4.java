class Solution {
    public int climbStairs(int n) {

        if(n==1){return 1;}

        int[]total_number_of_stairs=new int[n+1];
        total_number_of_stairs[1]=1;
        total_number_of_stairs[2]=2;

        

        for(int i=3;i<=n;i++){
            total_number_of_stairs[i]=total_number_of_stairs[i-1]+total_number_of_stairs[i-2];
        }
        return total_number_of_stairs[n];
        
    }
}
