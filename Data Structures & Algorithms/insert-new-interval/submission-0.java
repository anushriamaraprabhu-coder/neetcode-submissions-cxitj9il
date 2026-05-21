class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        int[][]result=new int[intervals.length+1][2];
        int i=0;
        int j=0;

        //add all the intervals in the new result which are non overlapping
        while(i<intervals.length && newInterval[0]>intervals[i][1]){
            result[j++]=intervals[i++];
        }

        //merge the overlapping interval
        while(i<intervals.length && intervals[i][0]<=newInterval[1]){
            newInterval[0]=Math.min(newInterval[0],intervals[i][0]);
            newInterval[1]=Math.max(newInterval[1],intervals[i++][1]);
        }

        result[j++]=newInterval;

        //add the remaining elements

        while(i<intervals.length){
            result[j++]=intervals[i++];

        }
        return java.util.Arrays.copyOf(result,j);
    }
}
