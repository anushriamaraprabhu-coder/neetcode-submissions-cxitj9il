class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer,Integer>map=new HashMap<>();
        int prefixsum=0;
        int count=0;

        map.put(0,1);

        for(int num:nums){

            prefixsum+=num;

            int neededprefix=prefixsum-k;

            if(map.containsKey(neededprefix)){

                count+=map.get(neededprefix);

            }

            map.put(prefixsum,map.getOrDefault(prefixsum,0)+1);



        }

        return count;

        
    }
}