class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> counterMap = new HashMap<>(); // Cyfra i wystapienie?
        int maxNumber = nums[0];
        int maxOccurence = 1;

        for (int i =0; i < nums.length; i++) {

            
            if (counterMap.get(nums[i]) != null ) {
                int newValue = counterMap.get(nums[i]) + 1;
                if(newValue > maxOccurence) {
                    maxOccurence = newValue;
                    maxNumber = nums[i];
                }
                counterMap.put(nums[i], newValue);
            } else {
                counterMap.put(nums[i], 1);
            }


        }

        return maxNumber;
    }
}