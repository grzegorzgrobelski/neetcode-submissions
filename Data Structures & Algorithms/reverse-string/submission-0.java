class Solution {
    public static void reverseString(char[] s) {
        int firstPointerIndex = 0;
        int secondPointerIndex = s.length -1;


        while (firstPointerIndex < secondPointerIndex) {
            char firstChar = s[firstPointerIndex];
            char secondChar = s[secondPointerIndex];

            s[firstPointerIndex] = secondChar;
            s[secondPointerIndex] = firstChar;
            firstPointerIndex++;
            secondPointerIndex--;
        }
    }
}