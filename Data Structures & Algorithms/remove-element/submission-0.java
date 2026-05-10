class Solution {
    public int removeElement(int[] nums, int val) {
        /**

        nums = [1,1,2,3,4], val = 1

        0 1 2 3 4 5 6
        0 1 3 0 4 2 2      val = 2
                  p1
                    p2




        *
      */

        int p1 = 0;
        int p2 = 0;

        while (p2 < nums.length) {
            if (nums[p2] != val) {
                int tmp = nums[p1];
                nums[p1] = nums[p2];
                nums[p2] = tmp;
                p1++;
            }
            p2++;
        }

        return p1;
    }
}