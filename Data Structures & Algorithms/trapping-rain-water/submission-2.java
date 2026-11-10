class Solution {
    public int trap(int[] height) {
        int totalTrappedWater = 0;
        int n = height.length;
        if (n == 0) {
            return 0;
        }
        int[] prefMax = new int[n];
        prefMax[0] = height[0];
        for(int i =1;i<n;i++){
            prefMax[i] = Math.max(prefMax[i-1],height[i]);
        }

        int[] sufxMax = new int[n];
        sufxMax[n-1] = height[n-1];
        for(int i =n-2;i>=0;i--){
            sufxMax[i] = Math.max(sufxMax[i+1],height[i]);
        }

        for(int i = 0;i<n;i++){
            totalTrappedWater += (Math.min(prefMax[i],sufxMax[i])-height[i]);
        }

        return totalTrappedWater;
    }
}
