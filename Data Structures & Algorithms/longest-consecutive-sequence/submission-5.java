class Solution {
    public int longestConsecutive(int[] nums) {

        HashMap<Integer,Boolean>map=new HashMap<>();
        int maxLength=0;

        for(int num:nums){
            map.put(num, Boolean.FALSE);
        }

        //check forward 

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

            maxLength=Math.max(currentLength,maxLength);

        }

        return maxLength;
        
    }
}
