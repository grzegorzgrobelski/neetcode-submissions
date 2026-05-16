class Solution {
    public String longestCommonPrefix(String[] strs) {
        String longestPrefix = "";
        if (strs.length == 0) return longestPrefix;


        for(int i = 0; i <= strs[0].length(); i++) {
            String mychar = strs[0].substring(0, i); 
            for (String singleStr : strs) {
                if  (!singleStr.startsWith(mychar)) return longestPrefix;
            }
            longestPrefix = mychar;
        }
        return longestPrefix;
    }
}