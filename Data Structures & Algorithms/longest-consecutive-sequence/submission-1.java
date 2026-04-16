class Solution {
    public int longestConsecutive(int[] nums) {

        int longestLength=0;

        //initialize hashmap 

        HashMap<Integer,Boolean>map=new HashMap<>();

        //iterate thru the array and initialize the firat valuse as false 

        for(int num:nums){     

            map.put(num, Boolean.FALSE);      
        }

        //FORWARD CHECKING 

        //1. take a current length 
        //2. check if it has already been traversed by checking if it is false 
        //3. if not increment the current length and set the value to true 

        for(int num:nums){
            int nextNumber=num+1;
            int currLength=1;

            while(map.containsKey(nextNumber) && map.get(nextNumber)==false){
            
            currLength++;
            map.put(nextNumber, Boolean.TRUE);
            nextNumber++;
            }

            //CHECK BACKWARD 

            int prevNumber=num-1;

            while(map.containsKey(prevNumber) && !map.get(prevNumber)){
                currLength++;
                map.put(prevNumber, Boolean.TRUE);
                prevNumber--;
            }

            longestLength=Math.max(currLength,longestLength);            
        }
            return longestLength;

         }
}
