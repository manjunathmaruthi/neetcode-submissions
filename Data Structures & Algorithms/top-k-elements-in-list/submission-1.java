class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0]-b[0]);
        Set<Integer> keys = map.keySet();

        for (int key : keys) {
            minHeap.add(new int[]{map.get(key), key});

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        int result[] = new int[k];
        int j=0;
        while (minHeap.size() != 0) {
            int[] pair = minHeap.poll();
            result[j] = pair[1];
            j++;
        }

        return result;
    }
}
