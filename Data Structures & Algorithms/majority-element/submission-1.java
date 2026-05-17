class Solution {
    public int majorityElement(int[] nums) {
        
        int element = nums[0];
        int vote = 0;

        for (int i=0; i < nums.length; i++) {

            if (element == nums[i]) {
                vote++;
            } else {
                vote--;

                if (vote == 0) {
                    element = nums[i];
                    vote = 1;
                }
            }
        }

        return element;
    }
}