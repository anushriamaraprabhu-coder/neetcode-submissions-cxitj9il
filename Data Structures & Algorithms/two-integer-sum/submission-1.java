class Solution {
    public static int[] twoSum(int[] nums, int target) {

       HashMap<Integer,Integer>map=new HashMap<>();

       for(int i=0;i<nums.length;i++){
        int req_number=target-nums[i];

        if(map.containsKey(req_number)){
            int[]arr={map.get(req_number),i};
            return arr;
        }
        map.put(nums[i],i);
       }
       return null;
    }

    public static void main(String[]args){

        int[]nums={3,4,5,6};
        int target=7;
        twoSum(nums,target);

    }
}
