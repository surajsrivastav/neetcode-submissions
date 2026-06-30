class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length==0){
            return 0;
        }
        //Create Hashset
        Set<Integer> numSet = new HashSet<>();
        for (int num: nums){
            numSet.add(num);
        }
        //streak counter
        int longestStreakCounter = 0;
        int currentNum = 0;
        int currentStreak = 0;
        //iterate through the array
        for(int num : numSet){
            if(!numSet.contains(num -1)){
                 currentNum = num;
                 currentStreak = 1;
            }
            //how far the sequence go
            while(numSet.contains(currentNum + 1)){
                currentNum += 1;
                currentStreak += 1;
            }
            longestStreakCounter = Math.max(longestStreakCounter , currentStreak);
        }
        return longestStreakCounter;
    }
}
