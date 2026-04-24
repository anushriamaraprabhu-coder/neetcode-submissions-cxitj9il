class Solution {
    public int longestConsecutive(int[] nums) {

        HashMap<Integer,Boolean>map=new HashMap<>();
        int maxLength=0;

        for(int num:nums){
            map.put(num, Boolean.FALSE);
        }

        for(int num:nums){

            int nextNumber=num+1;
            int currentlength=1;

            while(map.containsKey(nextNumber) && map.get(nextNumber)==false){
                    currentlength++;
                    map.put(nextNumber, Boolean.TRUE);
                    nextNumber++;
                
            }

            int prevNumber=num-1;

            while(map.containsKey(prevNumber) && !map.get(prevNumber)){
                currentlength++;
                map.put(prevNumber, Boolean.TRUE);
                prevNumber--;
            }

            maxLength=Math.max(maxLength,currentlength);
            
        }

        return maxLength;
        
    }
}
