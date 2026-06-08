class Solution {
    public int[][] merge(int[][] intervals) {

        if(intervals.length<=1){return intervals;}

        List<int[]>list=new ArrayList<>();

        Arrays.sort(intervals,Comparator.comparingInt(a->a[0]));

        int[]newinterval=intervals[0];
        list.add(newinterval);

        for(int[]oldinterval:intervals){
            //{1,3}
            //{4,5}

            if(newinterval[1]>=oldinterval[0]){
                newinterval[0]=Math.min(oldinterval[0],newinterval[0]);
                newinterval[1]=Math.max(oldinterval[1],newinterval[1]);
            }

            else{

                newinterval=oldinterval;
                list.add(newinterval);
            }
        }

        return list.toArray(new int[0][]);
        
    }
}
