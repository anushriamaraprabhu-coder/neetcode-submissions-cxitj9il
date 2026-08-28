class Solution {
    public int longestConsecutive(int[] nums) {

        int maxlen=0;
        
        HashSet<Integer>set=new HashSet<>();

        for(int num:nums){
            set.add(num);
        }

        for(int num:set){

            if(!set.contains(num-1)){
                int currentnum=num;
                int currentlen=1;

                while(set.contains(currentnum+1)){

                    currentnum++;
                    currentlen++;
                }

                  maxlen=Math.max(currentlen,maxlen);


            }

            
            

          
        }

        return maxlen;
        
    }
}
