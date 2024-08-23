class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int high = Arrays.stream(piles).max().getAsInt();
        int low = 1;
        int ans = high;
        while (low <= high) {
            int mid = (low+high)/2;
            if (feasible(piles, h, mid)) {
                ans = mid;
                high = mid - 1;
            }  
            else {
                low = mid + 1;
            }  
        }

        return ans;
    }

    public boolean feasible(int[] piles, int h, int k) {
        int hours = 0;
        for (int p : piles) {
            hours += Math.ceil((double)p/k);
        }

        return hours <= h;
    }
}