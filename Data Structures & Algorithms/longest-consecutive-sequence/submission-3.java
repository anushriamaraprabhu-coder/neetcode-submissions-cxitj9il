class Solution {
    public int longestConsecutive(int[] nums) {

        int longestLength=0;

        HashMap<Integer,Boolean>map=new HashMap<>();

        for(int num:nums){
            map.put(num, Boolean.FALSE);

        }

        //check forward elements 

        for(int num:nums){
            int currentLength=1;
            int nextNumber=num+1;
            while(map.containsKey(nextNumber) && map.get(nextNumber)==false){

                currentLength++;

                map.put(nextNumber, Boolean.TRUE);

                nextNumber++;

            }

            int prevNumber=num-1;

            while(map.containsKey(prevNumber) && !map.get(prevNumber)){
                currentLength++;
                map.put(prevNumber, Boolean.TRUE);
                prevNumber--;
            }

            longestLength=Math.max(longestLength,currentLength);

        }

        return longestLength;
        
    }
}
