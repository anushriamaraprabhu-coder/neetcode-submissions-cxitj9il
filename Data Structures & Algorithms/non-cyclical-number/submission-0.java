class Solution {
    public boolean isHappy(int n) {

        HashSet<Integer>set=new HashSet<>();

        while(true){
            //calculate power

            int sum=0;
            while(n!=0){

                sum+=Math.pow(n%10,2);
                n=n/10;
            }
            if(sum==1)return true;

            n=sum;

            //check duplicates

            if(set.contains(n)){
                return false;
                
            }
            set.add(n);
        }
        
    }
}
