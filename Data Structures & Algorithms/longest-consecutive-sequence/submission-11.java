class Solution {
    public int longestConsecutive(int[] nums) {

        HashMap<Integer,Boolean>map=new HashMap<>();
        int maxLength=0;
        for(int num:nums){
            map.put(num, Boolean.FALSE);
        }

        for(int num:nums){

            int nextNumber=num+1;
            int currentLength=1;

            while(map.containsKey(nextNumber) && map.get(nextNumber)==false){
                currentLength++;
                map.put(nextNumber, Boolean.TRUE);
                nextNumber++;
            }
            int prev=num-1;
            while(map.containsKey(prev) && !map.get(prev)){
                currentLength++;
                map.put(prev,Boolean.TRUE);
                prev--;
            }

            maxLength=Math.max(currentLength,maxLength);

        }

        return maxLength;
        
    }
}
