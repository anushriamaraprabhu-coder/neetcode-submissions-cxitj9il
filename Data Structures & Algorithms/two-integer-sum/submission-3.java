class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer>map=new HashMap<>();

        for(int num:nums){

                for(int i=0;i<nums.length;i++){
                    int reqNumber=target-nums[i];

                    if(map.containsKey(reqNumber)){
                        int[]arr={map.get(reqNumber),i};
                        return arr;
                    }

                    map.put(nums[i], i);    
                }           
                
            }
            return null;
        }
        
    }

