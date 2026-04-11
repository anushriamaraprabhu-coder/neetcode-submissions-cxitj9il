class Solution {
    public int climbStairs(int n) {

        if(n==1){return 1;}

        int[]ways_to_climb=new int[n+1];
        ways_to_climb[1]=1;
        ways_to_climb[2]=2;

        for(int i=3;i<=n;i++){

            ways_to_climb[i]=ways_to_climb[i-1]+ways_to_climb[i-2];
        }

        return ways_to_climb[n];

        
    }
}
