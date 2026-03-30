class Solution {
    public static  boolean hasDuplicate(int[] nums) {

        HashSet<Integer>set=new HashSet<>();
        for(int n:nums){
            if(set.contains(n)){
                //set.add(n);
                return true;
            }
            set.add(n);
        }
        return false;
        
    }

    public static void main(String[]args){
        int[]nums={1,2,3,3};
        hasDuplicate(nums);
    }
}