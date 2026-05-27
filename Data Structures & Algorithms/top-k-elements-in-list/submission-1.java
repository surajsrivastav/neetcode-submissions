class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequencyCounter = new HashMap();
        for( int num : nums){
            if(frequencyCounter.containsKey(num)){
                frequencyCounter.put(num, frequencyCounter.get(num)+1);
            }
            else{
                frequencyCounter.put(num, 1);
            }
        } 
        List<Integer> listInteger = new ArrayList(frequencyCounter.keySet());
        listInteger.sort((a, b) -> frequencyCounter.get(b) - frequencyCounter.get(a));

        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = listInteger.get(i);
        }
        return arr;
    }
}