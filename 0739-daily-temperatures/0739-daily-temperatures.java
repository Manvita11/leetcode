class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer> st = new Stack<>(); 

        int[] result = new int[n];  
        Arrays.fill(result, 0); 
        for(int i = 0; i < n; i++) {
            int temp = temperatures[i];
            while(!st.empty() && temp > temperatures[st.peek()]) { 
                int idx = st.pop(); 
                result[idx] = i - idx; 
            }

            st.push(i);
        }

        return result;
    }
}