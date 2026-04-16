class Solution {
    public int longestConsecutive(int[] nums) {

        int longestLength=0;

        HashMap<Integer,Boolean>map=new HashMap<>();

        for(int num:nums){

            map.put(num, Boolean.FALSE);

        }

        //check forward 

        for(int num:nums){
            int nextnumber=num+1;
            int currentLength=1;

            while(map.containsKey(nextnumber) && map.get(nextnumber)==false){

                currentLength++;

                map.put(nextnumber, Boolean.TRUE);

                nextnumber++;
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
