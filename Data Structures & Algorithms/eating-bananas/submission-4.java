class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r =  Arrays.stream(piles).max().getAsInt();

        while (l <= r) {
            long total = 0;
            int mid = l + (r-l)/ 2; 
            
            for(int i : piles) {
                total += (int) Math.ceil((double) i / mid);
            }

            if (total > h) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return l;
    }
}
