class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer>set=new HashSet<>();
        int maxlen=0;

        for(int num:nums){
            set.add(num);
        }

        for(int num:set){

            if(!set.contains(num-1)){
                int currentlen=1;
                int currentnum=num;

                while(set.contains(currentnum+1)){
                    currentlen++;
                    currentnum++;
                }
                maxlen=Math.max(maxlen,currentlen);
            }
        }

        return maxlen;


        
    }
}
