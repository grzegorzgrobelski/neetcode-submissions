class Solution {
    public int search(int[] nums, int target) {
        return calc(nums, target, 0, nums.length-1);
    }


    public int calc(int[] nums, int target, int l, int r) {
        int mid = (int) Math.floor((l+r)/2);

        if (l == mid || r == mid || r == l) {
            if(nums[l] == target) return l;
            else if(nums[r] == target) return r;
            else return -1;
        }
        
        if (nums[mid] < target) {
            return calc(nums, target, mid,r);
        } else {
            return calc(nums, target, l, mid);
        }
    }
}
