class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> numToOccurance = new HashMap<Integer,Integer>();
        for (int num : nums) {
            Integer occurrence = numToOccurance.get(num);
            if (occurrence != null) {
                numToOccurance.put(num, ++occurrence);
            } else {
                numToOccurance.put(num,1);
            }
        }
        
        HashMap<Integer,List<Integer>> bucketList = new HashMap<Integer,List<Integer>>();
        for (Map.Entry<Integer, Integer> entry : numToOccurance.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();

            List<Integer> occurance = bucketList.get(value);
            if (occurance != null) {
                occurance.add(key);
            } else {
                bucketList.put(value, new ArrayList<>(List.of(key)));
            }
        }   

        int[] result = new int[k];
        
        List<Integer> allSorted = new ArrayList<>();

        for (List<Integer> lstInt : bucketList.values()) {
            allSorted.addAll(lstInt);
            
        }
        int start = allSorted.size() - k;
        for (int i = 0; i < k; i++) {
            result[i] = allSorted.get(start + i);
        }
        return result;
    }
}
