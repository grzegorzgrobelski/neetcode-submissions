class Solution {
    public boolean validPalindrome(String s) {
        Integer leftIndex = 0;
        Integer rightIndex = s.length() - 1;

        while (leftIndex < rightIndex) {
            if (s.charAt(leftIndex) != s.charAt(rightIndex)) {
                String s1 = s.substring(leftIndex + 1, rightIndex +1);
                String s2 = s.substring(leftIndex, rightIndex);
                return isPali(s1) || isPali(s2);
            }

            leftIndex++;
            rightIndex--;
        }
        return true;
    }

    public boolean isPali(String s) {
        Integer leftIndex = 0;
        Integer rightIndex = s.length() - 1;

        while (leftIndex < rightIndex) {
            if (s.charAt(leftIndex) != s.charAt(rightIndex)) {
                return false;
            }

            leftIndex++;
            rightIndex--;
        }
        return true;
    }
}