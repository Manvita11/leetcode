class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> [] mn = new List[n+1];
        mn[0] = Arrays.asList("");
        mn[1] = Arrays.asList("()");

        for(int i=2; i<=n; i++) {
            mn[i] = new ArrayList<>();

            int inner = i-1;
            int outer = 0;

            while(inner >= 0 && outer <=i-1) {
                for(String in : mn[inner]) {
                    for(String out : mn[outer]) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("(");
                        sb.append(in);
                        sb.append(")");
                        sb.append(out);
                        mn[i].add(sb.toString());
                    }
                }
                inner--;
                outer++;
            }
        }
        return mn[n];
    }
}