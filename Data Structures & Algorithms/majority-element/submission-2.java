class Solution {
    public int majorityElement(int[] nums) {
        int counter = 1;
        int res = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == res) {
                counter++;
            } else {
                counter--;
                if(counter == 0) {
                    res = nums[i];
                    counter = 1;
                }
            }
        }

        return res;
    }
}