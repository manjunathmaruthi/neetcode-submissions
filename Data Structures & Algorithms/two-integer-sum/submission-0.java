class Solution {
    public int[] twoSum(int[] nums, int target) {
        /**
            6 4 5 3 target=7

            7 - 6 = 1





        *
      */

        int result[] = new int[2];
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int findNum = target - nums[i];

            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }

                if (findNum == nums[j]) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }

        return result;
    }
}
