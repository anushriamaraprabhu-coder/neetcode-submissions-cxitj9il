class Solution {
    public int[][] merge(int[][] intervals) {

        if(intervals.length<=1){return intervals;}

        Arrays.sort(intervals,Comparator.comparingInt(a->a[0]));

        List<int[]>list=new ArrayList<>();

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
