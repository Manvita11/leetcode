class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1 || numRows >= s.length()) return s;
        StringBuilder[] sb = new StringBuilder[numRows];
        for(int k=0; k<numRows; k++) {
            sb[k] = new StringBuilder();
        }
        int increment = 1, index = 0;
        for(int i=0; i< s.length(); i++) {
            sb[index].append(s.charAt(i));
            if(index == 0) {
                increment = 1;
            }
            if(index == numRows -1) {
                increment = -1;
            }
            index += increment;
        }
        StringBuilder result = new StringBuilder();
        for(int k=0; k<numRows; k++) {
            result.append(sb[k]);
        }
        return result.toString();
    }
}