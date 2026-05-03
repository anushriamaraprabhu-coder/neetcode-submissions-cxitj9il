class Solution {
    public int longestConsecutive(int[] nums) {

        HashMap<Integer,Boolean>map=new HashMap<>();
        int maxlength=0;

        for(int num:nums){
            map.put(num, Boolean.FALSE);
        }

        for(int num:nums){

            int currentLength=1;
            int nextnum=num+1;

            while(map.containsKey(nextnum) && map.get(nextnum)==false){
                currentLength++;
                map.put(nextnum, Boolean.TRUE);
                nextnum++;
            }

            int prevnum=num-1;

            while(map.containsKey(prevnum) && !map.get(prevnum)){
                currentLength++;
                map.put(prevnum, Boolean.TRUE);
                prevnum--;
            }

            maxlength=Math.max(maxlength,currentLength);
        }

        return maxlength;
        
    }
}
