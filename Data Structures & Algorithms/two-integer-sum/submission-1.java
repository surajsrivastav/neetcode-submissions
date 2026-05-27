class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> diffMap = new HashMap();
        int[] indexes = new int[2];
        for(int i=0; i<nums.length; i++){
            int difference = target - nums[i];
            if(diffMap.containsKey(nums[i])){
                indexes[0] = diffMap.get(nums[i]);
                indexes[1] = i;
                return indexes;
            }else{
                diffMap.put(difference, i);
            }
        }
        return indexes;
    }
}
