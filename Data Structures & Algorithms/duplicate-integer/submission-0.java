class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> counterHash = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(counterHash.containsKey(nums[i])){
                return true;
            }
            counterHash.put(nums[i], 1);
        }
        return false;
    }
}