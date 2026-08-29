class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        List<Integer>[]buckets=new List[nums.length+1];

        HashMap<Integer,Integer>map=new HashMap<>();

        for(int num:nums){

            map.put(num,map.getOrDefault(num,0)+1);         
        }

        for(int key:map.keySet()){

            int freq=map.get(key);

            if(buckets[freq]==null){
                buckets[freq]=new ArrayList<>();
            }
            buckets[freq].add(key);
        }

            int[]ans=new int[k];
            int index=0;

            for(int i=buckets.length-1;i>=0;i--){

                if(buckets[i]!=null){

                    for(int value:buckets[i]){

                        ans[index]=value;
                        index++;

                        if(index==k){
                            return ans;
                        }

                    }
                }
            
        }

        return ans;

        
    }
}
