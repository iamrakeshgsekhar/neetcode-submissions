class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        /*
        [] nums , k

        k frequent elements

        hash map store count,

        map iterate get count>=k add to result
        */

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> Integer.compare(b[1],a[1]));
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int key = entry.getKey();
            int val = entry.getValue();

            pq.offer(new int[]{key,val});
        }



        int[] result = new int[k];
        int i = 0;
        while(!pq.isEmpty()&& i<k){
            int[] arr = pq.poll();
            result[i++] = arr[0];
        }
        return result;
    }
}
