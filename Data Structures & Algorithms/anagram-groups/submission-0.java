class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> test = new ArrayList<List<String>>();
        HashMap<String,List<String>> sortedListToGiven = new HashMap<String,List<String>>();
        
        for(String single: strs) {
            char[] sSort = single.toCharArray();
            Arrays.sort(sSort);
            String convertedChar = new String(sSort);

            List<String> foundString = sortedListToGiven.get(convertedChar);

            if (foundString != null) {
                foundString.add(single);
            } else {
                List<String> newListArray = new ArrayList<String>();
                newListArray.add(single);
                sortedListToGiven.put(convertedChar,newListArray);
            }
        }
        
        return new ArrayList<>(sortedListToGiven.values());
    }
}
