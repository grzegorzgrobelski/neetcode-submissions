class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> sortedStringToStrs = new HashMap<String,List<String>>();
        
        for(String single: strs) {
            char[] sSort = single.toCharArray();
            Arrays.sort(sSort);
            String convertedChar = new String(sSort);

            List<String> foundString = sortedStringToStrs.get(convertedChar);

            if (foundString != null) {
                foundString.add(single);
            } else {
                List<String> newListArray = new ArrayList<String>();
                newListArray.add(single);
                sortedStringToStrs.put(convertedChar,newListArray);
            }
        }
        
        return new ArrayList<>(sortedStringToStrs.values());
    }
}
