class Solution {
    public int[][] generateMatrix(int n) {
        
        int[][] matrix = new int[n][n];

        int startRow = 0;
        int endRow = n-1;
        int startCol =0;
        int endCol =n-1;
        int totalElements = n*n;
        int count =1;
        while(startRow<=endRow && startCol<=endCol && totalElements >0){

            //Left to right
            for(int i = startCol;i<=endCol && totalElements>0;i++){
                matrix[startRow][i] = count;
                totalElements--;
                count++;
            }
            startRow++;

            //TopToBottom
            for(int i = startRow;i<=endRow && totalElements>0;i++){
                matrix[i][endCol] = count;
                totalElements--;
                count++;
            }
            endCol--;

            //RightToLeft
            for(int i = endCol; i>=startCol && totalElements>0;i--){
                matrix[endRow][i]=count;
                totalElements--;
                count++;
            }
            endRow--;
            //BottomToUp
            for(int i = endRow; i>=startRow && totalElements >0;i--){
                matrix[i][startCol] = count;
                totalElements--;
                count++;
            }
            startCol++;
        }

        return matrix;
    }
}