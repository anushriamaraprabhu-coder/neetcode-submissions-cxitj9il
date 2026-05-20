class Solution {
    public int[][] merge(int[][] intervals) {

        //basic sanity checks
        if(intervals.length<=1){
            return intervals;
        }

        //Sort the array by their start time
        Arrays.sort(intervals,Comparator.comparingInt(a->a[0]));

        //Take a result arraylist to store the result
        List<int[]>list=new ArrayList<>();

        //Add the 0th interval to the list
        int[]newinterval=intervals[0];
        list.add(newinterval);

        for(int[]oldinterval:intervals){
            if(oldinterval[0]<=newinterval[1]){
                newinterval[1]=Math.max(newinterval[1],oldinterval[1]);
            }

            else{

                newinterval=oldinterval;
                list.add(newinterval);
            }
        }

        return list.toArray(new int[0][]);
        
    }
}
