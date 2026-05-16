class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hasmap = new HashMap<>();
        if (s.length() != t.length()) return false;

        for(int i=0 ; i<s.length(); i++) {
            char singleChar = s.charAt(i);
            Integer existingValue = hasmap.get(singleChar);
            if(existingValue != null ) {
                hasmap.put(singleChar,++existingValue);
            } else {
                hasmap.put(singleChar,1);
            }
        }

        for(int j=0 ; j< t.length(); j++) {
            char singleChar = t.charAt(j);
            System.out.println("singleChar " + singleChar);


            Integer existingValue = hasmap.get(singleChar);
            if(existingValue == null) return false;
            else if (--existingValue == 0) hasmap.remove(singleChar);
            else hasmap.put(singleChar,existingValue);

            //System.out.println("hasmap " + hasmap);
        }

        return true;
    }
}
