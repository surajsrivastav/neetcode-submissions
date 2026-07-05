class Solution {
    public int maxArea(int[] heights) {
        int leftPointer = 0;
        int rightPointer = heights.length -1;
        int maxWaterContainerArea = 0;
        while(leftPointer < rightPointer){//move the pointers until they cross
            int width = rightPointer - leftPointer;//width from graph
            int area = Math.min (heights[leftPointer], heights[rightPointer]) * width;
            maxWaterContainerArea = Math.max(area, maxWaterContainerArea);
            if(heights[leftPointer]<heights[rightPointer]){
                leftPointer+=1;
            }else{
                rightPointer-=1;
            }
        }
        return maxWaterContainerArea;
    }
}
