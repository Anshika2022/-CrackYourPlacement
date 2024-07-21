class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Long,Integer>map=new HashMap<>();
        long sum = 0;
        int count = 0;
        for(int i =0; i<nums.length; i++){
            sum+=nums[i];
                if(sum==k)count+=1;
                if(map.containsKey(sum-k)) count+=map.get(sum-k);
                map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;    
    }
}
