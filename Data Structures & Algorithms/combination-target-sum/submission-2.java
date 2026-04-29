class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {

        //store the result 
        List<List<Integer>>result=new ArrayList<>();

        Arrays.sort(nums);

        backtrack(nums,target,0,new ArrayList<>(),result);

        return result;
        
    }

    private void backtrack(int[]nums,int remaining, int start,List<Integer>current,List<List<Integer>>result){

        //Base case 
        if(remaining==0){
           result.add(new ArrayList<>(current));
           return;
        }

        

        for(int i=start;i<nums.length;i++){

            if(nums[i]>remaining)break;

            current.add(nums[i]);

            backtrack(nums,remaining-nums[i],i,current,result);

            current.remove(current.size()-1);

            
        }
    }
}
