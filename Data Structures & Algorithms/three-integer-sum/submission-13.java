class Solution {


public static List<List<Integer>> threeSum(int[] nums, int target) {
    List<List<Integer>> result = new ArrayList<>();
    Arrays.sort(nums);

    target = 0;
    int a = 0;
    int c = nums.length - 1;
    int b = c - 1;

    while ( c > 1) {

        if (nums[a] + nums[b] ==  target - nums[c]) {
            result.add(new ArrayList<>(Arrays.asList(nums[a], nums[b], nums[c])));
            a++;
            b--;
            while (a < b && nums[a] == nums[a-1]) {
                a++;
            }
            while (a < b && nums[b] == nums[b+1]) {
                b--;
            }
        } else if (nums[a] + nums[b] <  target - nums[c]) {
            a++;
            while (a < b && nums[a] == nums[a-1]) {
                a++;
            }
        } else {
            b--;
            while (a < b && nums[b] == nums[b+1]) {
                b--;
            }
        }


        if ( a >= b ) {
            c = c -1;
            while ( c > 1 && nums[c] == nums[c+1]) {
                c = c -1;
            }
            a = 0;
            b = c - 1;
        }
    }

    return result;
}


    public List<List<Integer>> threeSum(int[] nums) {
        return threeSum(nums, 0);
    
    }
}
