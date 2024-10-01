class Solution {
    public boolean canArrange(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int x : arr) {
            int k1 = ((x % k) + k) % k; 
            if(map.containsKey(k1)) {
                map.put(k1, map.get(k1)+1);
            } else {
                map.put(k1, 1);
            }
        }
       
        for(int i=0;i<k;i++) {
       

            if(i==0 ||  (i == k - i)) {
              if((map.getOrDefault(i,0))%2 != 0) {
                return false;
              }
            } else {
                int c = map.getOrDefault(i,0);
                int x = map.getOrDefault(k-i,0);
                if(c != x) 
                   return false;
            }
            
        }
        return true;
    }
}