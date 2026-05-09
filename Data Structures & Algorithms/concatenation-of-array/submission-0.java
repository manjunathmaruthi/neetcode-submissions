class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] result = new int[2*nums.length];
        int j = 0;
        int k = 0;
        while (j < 2) {
            for (int i=0; i < nums.length; i++) {
                result[k] = nums[i];
                k++;
            }
            j++;
        }

        return result;

        
    }
}