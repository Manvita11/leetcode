class Solution {
    public String frequencySort(String s) {
     StringBuilder sb = new StringBuilder();
        Map<Character, Integer> mp = new HashMap<>();
        
        // Traversing in the String to insert character in the map according to their frequency.
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(mp.isEmpty()){
                mp.put(ch,1);
            }
            else if(mp.containsKey(ch)){
                mp.put(ch, mp.get(ch) + 1);
            }
            else {
                mp.put(ch, 1);
            }
        }

        //  Inserting all the element of Map into list.
        List<Map.Entry< Character, Integer>> list = new ArrayList<>(mp.entrySet());

        //  Sorting the List.
        list.sort(Map.Entry.comparingByValue());

        // Reversing the list in order to get the most frequent character in the start.
        Collections.reverse(list);

        //  Traversing in the list and inserting character in the Stringbuilder according to their frequency.
        for (Map.Entry<Character, Integer> entry : list) {
            int a = entry.getValue();
            char c = entry.getKey();
            while(a>0){
                sb.append(c);
                a--;
            }
        }

     return sb.toString();
    }
}