class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        int[][]result=new int[intervals.length+1][2];
        int i=0;
        int j=0;

        //Add non overlapping intervals
        //{2,5}--old
        //{6,9}--new
        while(i<intervals.length && intervals[i][1]<newInterval[0]){
            result[j++]=intervals[i++];
        }

        //check for merges
        while(i<intervals.length && intervals[i][0]<=newInterval[1] ){
            newInterval[0]=Math.min(intervals[i][0],newInterval[0]);
            newInterval[1]=Math.max(newInterval[1],intervals[i++][1]);
        }

        result[j++]=newInterval;

        while(i<intervals.length){
            result[j++]=intervals[i++];
        }

        return java.util.Arrays.copyOf(result,j);
        
    }
}
