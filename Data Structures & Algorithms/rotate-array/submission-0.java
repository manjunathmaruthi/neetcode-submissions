class Solution {
    public void rotate(int[] nums, int k) {

        k = k % nums.length;

        int l = 0;
        int r = nums.length - 1;

        reverseArray(nums,l,r);

       reverseArray(nums,l,k-1);

       reverseArray(nums,k,r);
        
    }

    private void reverseArray(int[] nums, int l, int r) {
        while (l < r) {
            int tmp = nums[r];
            nums[r] = nums[l];
            nums[l] = tmp;
            r--;
            l++;
        }
    }
}