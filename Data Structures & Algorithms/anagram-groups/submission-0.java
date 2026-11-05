class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();

        Map<String,List<String>> map = new HashMap<>();

        for(String s : strs){
            String key = getKey(s);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(s);
        }


        for(List<String> lst : map.values()){
            result.add(lst);
        }

        return result;
    }

    private String getKey(String s){
        char[] ars = s.toCharArray();

        Arrays.sort(ars);

        return new String(ars);
    }
}
