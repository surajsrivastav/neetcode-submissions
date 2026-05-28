class Solution {
    public int[] productExceptSelf(int[] nums) {
        int sizeOfArray = nums.length;
        int[] result = new int[sizeOfArray];
        result[0] = 1;
        for(int i=1; i<sizeOfArray;i++){
            result[i] = nums[i-1]*result[i-1];
        }
        int suffix=1;
        for(int i=sizeOfArray -1; i>=0; i--){
            result[i]*= suffix;
            suffix *= nums[i];
        }
        return result;
    }
}  
