class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer>set=new HashSet<>();
        int maxlen=0;

        for(int num:nums){
            set.add(num);
        }

        for(int i=0;i<nums.length;i++){

            if(!set.contains(nums[i]-1)){
                int currentlen=1;
                int currentnum=nums[i];

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
