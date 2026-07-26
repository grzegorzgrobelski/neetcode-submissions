class Solution {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int firstInx = 0;
        int lstInx = s.length() -1;
        
        while (firstInx < lstInx) {
            if (s.charAt(firstInx) != s.charAt(lstInx)) {
                return false;
            } else {
                firstInx++;
                lstInx--;
            }
        }

        return true;
    }
}
