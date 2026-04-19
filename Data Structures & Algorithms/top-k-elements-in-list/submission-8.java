class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        List<Integer>[]buckets=new List[nums.length+1];

        HashMap<Integer,Integer>map=new HashMap<>();

        for(int num:nums){
                //add all the elements to the hashmap in key and value pair 

            map.put(num, map.getOrDefault(num, 0)+1);

        }

        //Process the elements in the bucket 

        for(int key:map.keySet()){
            int freq=map.get(key);
            if(buckets[freq]==null){
                buckets[freq]=new ArrayList<>();
            }

            buckets[freq].add(key);
        }

        //process the result list 

        int[]res=new int[k];
        int counter=0;

        for(int i=buckets.length-1; i>=0 && counter<k;i--){
            if(buckets[i]!=null){
                for(Integer integer:buckets[i]){
                    res[counter++]=integer;
                }
            }
        }

        return res;
        
    }
}
