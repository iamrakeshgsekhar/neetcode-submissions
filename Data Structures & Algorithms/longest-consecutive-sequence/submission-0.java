class Solution {
    public int longestConsecutive(int[] nums) {
        //brute force is O(n^2)
        // using sort is o(log(n))
        // best is o(n)*

        Set<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        int res = 0;

        for(int num : set){
            if(!set.contains(num-1)){
                int current = num;
                int count = 1;
                while(set.contains(current+1)){
                    current= current+1;
                    count++;
                }
                res = Math.max(res,count);
            }
        }

        return res;
    }
}
