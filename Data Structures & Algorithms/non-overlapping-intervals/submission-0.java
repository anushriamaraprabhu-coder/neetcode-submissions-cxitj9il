class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

        
        //if we dont have any intervals to check we return 0
        //base case
        if(intervals.length==0){return 0;}

        Arrays.sort(intervals,Comparator.comparingInt(a->a[1]));

        //we will have atleast one interval after the counting is completed
        int count=1;

        //keep track of the previous interval as well
        int previousinterval=0;

        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]>=intervals[previousinterval][1]){
                previousinterval=i;
                count++;
            }
        }
        return intervals.length-count;
    }
}
