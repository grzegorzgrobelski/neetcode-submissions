class Solution {
    public boolean validPalindrome(String s) {
        Integer leftIndex = 0;
        Integer rightIndex = s.length() - 1;

        while (leftIndex < rightIndex) {
            if (s.charAt(leftIndex) != s.charAt(rightIndex)) {
                String s1 = s.substring(leftIndex + 1, rightIndex +1);
                String s2 = s.substring(leftIndex, rightIndex);
                return s1.equals(new StringBuilder(s1).reverse().toString()) || s2.equals(new StringBuilder(s2).reverse().toString());
            }

            leftIndex++;
            rightIndex--;
        }
        return true;
    }
}