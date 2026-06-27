class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j = 0;
        int size = nums.length;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        while (j < size) {
            sum = sum + nums[j];

            if (sum < target) {
                j++;
            } else if (sum == target) {
                minLength = Math.min(minLength, j - i + 1);
                j++;
            } else if (sum > target) {
                while (sum >= target) {
                    minLength = Math.min(minLength, j - i + 1);
                    sum = sum - nums[i];
                    i++;
                }
                j++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}