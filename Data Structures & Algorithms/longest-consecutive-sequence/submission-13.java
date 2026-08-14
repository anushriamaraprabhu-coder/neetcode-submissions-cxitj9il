class Solution {
    public int longestConsecutive(int[] nums) {

        int maxlen=0;
        HashSet<Integer>set=new HashSet<>();

        for(int num:nums){
            set.add(num);
        }

        for(int value:set){

            if(!set.contains(value-1)){

                int currentlen=1;
                int currentnum=value;

            

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
