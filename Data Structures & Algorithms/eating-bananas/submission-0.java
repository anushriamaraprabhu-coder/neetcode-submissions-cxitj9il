class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int left=1;
        int maxrightpile=0;

        for(int i=0;i<piles.length;i++){
            maxrightpile=Math.max(piles[i],maxrightpile);
        }

        int right=maxrightpile;

        int result=maxrightpile;
        

        while(left<=right){

            int totalhours=0;

            int mid=left+(right-left)/2;

            for(int i=0;i<piles.length;i++){
            

            totalhours+=(int)Math.ceil((double)piles[i]/mid);

            }

            if(totalhours<=h){
                result=mid;
                right=mid-1;
            }
            if(totalhours>h){
                left=mid+1;
            }
            
            
        }

        return result;

        
    }
}
