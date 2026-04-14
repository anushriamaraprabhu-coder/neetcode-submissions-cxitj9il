class Solution {
    public int climbStairs(int n) {

        if(n==1){return 1;}

        int[]ways_to_climb_stairs=new int[n+1];

        ways_to_climb_stairs[1]=1;
        ways_to_climb_stairs[2]=2;

        for(int i=3;i<=n;i++){
        ways_to_climb_stairs[i]=ways_to_climb_stairs[i-1]+ways_to_climb_stairs[i-2];

        }

        return ways_to_climb_stairs[n];

        

        
        
    }
}
