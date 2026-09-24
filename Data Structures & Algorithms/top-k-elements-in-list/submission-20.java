class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer>[] bucket = new List[nums.length + 1];

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : map.keySet()) {
            int freq = map.get(num);

            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
        

            bucket[freq].add(num);

        }

            int[]ans=new int[k];
            int index=0;

            for (int i = bucket.length - 1; i >= 0; i--) {
                if (bucket[i] != null) {
                    for (int value : bucket[i]) {
                        ans[index] = value;
                        index++;

                        if (index == k) {return ans;}
                    }
                }
            }
        

        return ans;
    }
}
