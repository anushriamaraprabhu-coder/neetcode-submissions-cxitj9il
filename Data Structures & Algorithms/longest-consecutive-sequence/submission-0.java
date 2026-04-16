class Solution {
    public int longestConsecutive(int[] nums) {

        int longestLength=0;

        HashMap<Integer,Boolean>map=new HashMap<>();

        for(int num:nums){
            map.put(num,Boolean.FALSE);
        }

        //iterate thru nums array

        for(int num:nums){
            //take one current length as 1 to compare it with the longest lenght at the end

            int currlength=1;

            int nextnumber=num+1;

            while(map.containsKey(nextnumber) && map.get(nextnumber)==false){

                currlength++;
                map.put(nextnumber, Boolean.TRUE);

                nextnumber++;
            }


            //Check backward condition now

            int prevNumber=num-1;

            while(map.containsKey(prevNumber) && !map.get(prevNumber)){

                currlength++;

                map.put(prevNumber, Boolean.TRUE);

                prevNumber--;
        
            }
             longestLength=Math.max(longestLength,currlength);

        }

        return longestLength;     
        
    }
}
