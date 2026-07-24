class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0, right = n-1;
        int maxArea = 0;
        int minHeight = 0;

        while(left < right){
            minHeight = Math.min(height[left],height[right]);
            maxArea = Math.max(maxArea, minHeight * (right - left));
            if(height[left] < height[right]) left++;
            else right--;
        }
        return maxArea;
    }
}