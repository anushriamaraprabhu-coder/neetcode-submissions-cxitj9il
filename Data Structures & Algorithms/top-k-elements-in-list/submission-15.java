class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer>map=new HashMap<>();
        List<Integer>result=new ArrayList<>();

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        List<Integer>[]buckets=new List[nums.length+1];

        for(int num:map.keySet()){

            int freq=map.get(num);
            if(buckets[freq]==null){
                buckets[freq]=new ArrayList<>();
            }
            buckets[freq].add(num);

        }

        for(int i=buckets.length-1;i>=0;i--){

            if(buckets[i]!=null){

                for(int value:buckets[i]){
                    result.add(value);

                    if(result.size()==k){
                        int[]ans=new int[k];
                        for(int j=0;j<k;j++){
                            ans[j]=result.get(j);
                        }

                        return ans;
                    }
                }

            }
        }

        return new int[0];

        
    }
}
