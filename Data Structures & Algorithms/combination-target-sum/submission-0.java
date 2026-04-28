class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        
        //Store the result 
        List<List<Integer>>result=new ArrayList<>();

        //Sort the array 
        Arrays.sort(nums);

        //We will take a backtrack helper function

        backtrack(nums,target,0,new ArrayList<>(),result);

        return result;      
    }

    private void backtrack(int[]nums, int remaining, int start, List<Integer>current, List<List<Integer>>result){

        // Classic Base case 
        if(remaining==0){
            result.add(new ArrayList<>(current));
            return;
        }

        for(int i=start;i<nums.length;i++){

            //Pruning since array is already sorted 
            if(nums[i]>remaining)
            break;

            //Now current is empty[]. So we will start adding the num[i] 
            current.add(nums[i]);

            //Now we will backtrack using the same elemets(reuse). this part is recurssion 
            backtrack(nums,remaining-nums[i],i,current,result);

            //no vaild combinations found we backtrack/undo things 
            current.remove(current.size()-1);
        }
    }
}
