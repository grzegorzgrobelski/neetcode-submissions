class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        int firstPointerIndex = 0;
        int secondPointerIndex = numbers.length - 1;

        while (firstPointerIndex < secondPointerIndex) {
            int firstValue = numbers[firstPointerIndex];
            int secondValue = numbers[secondPointerIndex];
            int sum = firstValue + secondValue;

            if (sum == target) {
                return new int[] {firstPointerIndex +1 , secondPointerIndex +1};
            } else if (sum < target) {
                firstPointerIndex++;
            } else {
                secondPointerIndex--;
            }
        }

        return null;
    }
}
