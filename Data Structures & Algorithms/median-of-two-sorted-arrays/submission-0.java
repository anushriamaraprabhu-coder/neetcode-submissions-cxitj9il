class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        if(nums1.length>nums2.length){

            int[]temp=nums1;
            nums1=nums2;
            nums2=temp;
        }

        int left=0;
        int right=nums1.length;

            int m=nums1.length;
            int n=nums2.length;


        while(left<=right){

            int partition1=left+(right-left)/2;
            int partition2=(m+n+1)/2-partition1;

            int left1;
            int right1;
            int left2;
            int right2;
        
            if(partition1==0){

                left1=Integer.MIN_VALUE;
            }
            else{
                left1=nums1[partition1-1];
            }
            if(partition1==nums1.length){
                right1=Integer.MAX_VALUE;
            }
            else{
                right1=nums1[partition1];
            }

            if(partition2==0){
                left2=Integer.MIN_VALUE;
            }
            else{
                left2=nums2[partition2-1];
            }
            if(partition2==nums2.length){
                right2=Integer.MAX_VALUE;;
            }
            else{
                right2=nums2[partition2];
            }

            if(left1<=right2 && left2<=right1 ){

                int total=m+n;

                if(total%2!=0){
                    return Math.max(left1,left2);
                }
                else{
                    int largestleft=Math.max(left1,left2);
                    int smallestright=Math.min(right1,right2);

                    return (largestleft+smallestright)/2.0;
                }

                
            }

            else if(left1>right2){
                    right=partition1-1;
             }
            else{
                    left=partition1+1;
               
             }

        }

        return 0.0;
        
    }
}
