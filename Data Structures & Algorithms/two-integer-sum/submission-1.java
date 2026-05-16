class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> differenceToIndex = new HashMap<>();

        for(int i= 0; i < nums.length; i++) {
            int difference = target - nums[i];
            int searched = target - difference;

            Integer foundIndex = differenceToIndex.get(searched); 
            if (foundIndex != null) {
                return new int[]{foundIndex > i ? i : foundIndex, foundIndex > i ? foundIndex : i};
            } else {
                differenceToIndex.put(difference,i);
            }
        }
        return new int[2];
    }
}
