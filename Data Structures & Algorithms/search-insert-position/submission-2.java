class Solution {
    public static int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int mid = 0;

        while (l <= r) {
            mid = (l+r)/2;
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
        return l;
    }
}