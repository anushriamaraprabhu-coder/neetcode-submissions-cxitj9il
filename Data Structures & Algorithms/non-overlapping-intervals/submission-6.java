class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

        int n=intervals.length;
        int count=1;
        Arrays.sort(intervals,Comparator.comparingInt(a->a[1]));

        int previousinterval=0;

        //{1,2}-->previous
        //{3,4}-->current i

        for(int i=0;i<n;i++){
            if(intervals[i][0]>=intervals[previousinterval][1]){
                previousinterval=i;
                count++;
            }
        }

        return intervals.length-count;
        
    }
}
