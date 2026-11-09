class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        int n = nums.length;
        for(int i = 0;i<n;i++){
            int left = i+1;
            int right = n-1;
            int current = nums[i];
            if(current > 0) break;
            if(i>0 && nums[i] == nums[i-1]) continue;
            while(left<right){
                int total = nums[left]+nums[right];
                int tar = total+current;
                if( tar == 0 ){
                    result.add(List.of(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                    while(left<right && nums[left]== nums[left-1]){
                        left++;
                    }
                }else if (tar<0){
                    left++;
                }else{
                    right--;
                }
            }
        }

        return result;
    }
}
