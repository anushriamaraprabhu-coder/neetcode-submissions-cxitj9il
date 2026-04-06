class Solution {
    public static int search(int[] nums, int target) {

        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
        
    }

    public static void main(String[]args){
        int[]nums={-1,0,2,4,6,8};
        int target=4;
        search(nums,target);

    }
}
