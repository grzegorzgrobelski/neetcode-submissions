class Solution {
    public void sortColors(int[] nums) {

        int l = 0;
        int m = 0;
        int r = 0;

        for(int n : nums) {
            if (n == 0) l++;
            if (n == 1) m++;
            if (n == 2) r++;
        }

        for(int i = 0; i < nums.length; i++) {
            if (l > 0) {
                nums[i] = 0;
                l--;
            } else if ( m > 0) {
                nums[i] = 1;
                m--;
            } else if( r > 0) {
                nums[i] = 2;
                r--;
            }
        }
    }
}