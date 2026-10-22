class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int mid = (l+r)/2;

            if (nums[mid] < target) {
                mid = mid +1;
                l = mid;
            } else if(nums[mid] > target) {
                mid = mid -1;
                r = mid;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
