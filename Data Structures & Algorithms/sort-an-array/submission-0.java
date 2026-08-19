class Solution {
    public int[] sortArray(int[] nums) {
        int[] leftArray = Arrays.copyOfRange(nums,0,nums.length/2);
        int[] rightArray = Arrays.copyOfRange(nums,nums.length/2,nums.length);

        if (nums.length == 1) {
            return nums;
        }

        return subSortArray(sortArray(leftArray),sortArray(rightArray));
    }


    public int[] subSortArray(int[] num1, int[] num2) {
        int[] res = new int[num1.length + num2.length];
        int l = 0, r = 0;

        while (l < num1.length && r < num2.length) {
            if (num1[l] < num2[r]) {
                res[l+r] =  num1[l];
                l++;
            } else {
                res[l+r] = num2[r];
                r++;
            }
        }
        while (l < num1.length) {
            res[l+r] = num1[l];
            l++;
        }
        while (r < num2.length) {
            res[l+r] = num2[r];
            r++;
        }

        return res;
    }
}