class Solution {
    public int numRescueBoats(int[] people, int limit) {

        Arrays.sort(people);

        int left=0;
        int right=people.length-1;
        int minboats=0;

        while(left<=right){

            int sum=people[left]+people[right];

            if(sum<=limit){
                minboats++;
                left++;
                right--;
            }

            else if(sum>limit){
                minboats++;
                right--;
            }
            
        }

        return minboats;



        
    }
}