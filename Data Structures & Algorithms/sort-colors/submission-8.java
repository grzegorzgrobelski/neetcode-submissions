class Solution {
    public void sortColors(int[] nums) {
        int l = 0;
        int m = 0;
        int r = nums.length -1;

        int tempVal;


        while(m <= r) {
            if (nums[m] == 1) {
                m++;
                continue;
            }

            if (nums[m] == 0) {
                tempVal = nums[l];
                nums[l] = nums[m];
                nums[m] = tempVal;
                l++;
                m++;
            } else {
                tempVal = nums[r];
                nums[r] = nums[m];
                nums[m] = tempVal;
                r--;
            }
        }
    }
}