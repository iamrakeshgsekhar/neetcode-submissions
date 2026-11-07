class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeroCount = 0;
        int zeroIndex = 0;

        int product = 1;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 0){
                zeroCount++;
                zeroIndex = i;
            }else{
                product*=nums[i];
            }
        }
        int n = nums.length;

        int[] res = new int[n];
        if(zeroCount > 1){
            return res;
        }else if (zeroCount == 1){
            res[zeroIndex] = product;
            return res;
        }

        for(int i = 0;i<n;i++){
            res[i] = product/nums[i];
        }

        return res;
    }
}  
