class Solution {
    public int majorityElement(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<>();

        for (int n: nums) {
            map.put(n, map.getOrDefault(n,0)+1);
        }

        Set<Map.Entry<Integer,Integer>> entries = map.entrySet();

        for(Map.Entry<Integer,Integer> entry : entries) {
            if (entry.getValue() > nums.length/2) {
                return entry.getKey();
            }
        }

        return -1;
    }
}