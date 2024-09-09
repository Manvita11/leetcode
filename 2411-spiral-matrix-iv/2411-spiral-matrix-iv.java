class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] arr = new int[m][n];    

        for(int i = 0; i < m; i++) {    
            for(int j = 0; j < n; j++) {
                arr[i][j] = -1;
            }
        }

        int id = 0;  
        int top = 0, left = 0;
        int down = m - 1, right = n - 1;

        while(top <= down && left <= right){
            if(id == 0){   
                for(int i = top; head != null && i <= right ; i++){
                    arr[top][i] = head.val;
                    head = head.next; 
                }
                top++;  
            }
            else if(id == 1){  
                for(int i = top; head != null &&i <= down ; i++){
                    arr[i][right] = head.val;
                    head = head.next;
                }
                right--;     
            }
            else if(id == 2){  
                for(int i = right; head != null && i >= left; i--){
                    arr[down][i] = head.val;
                    head = head.next;
                }
                down--; 
            }
            else if(id == 3){  
                for(int i = down; head != null && i >= top; i--){
                    arr[i][left] = head.val;
                    head = head.next;
                }
                left++; 
            }
            
            id = (id + 1) % 4;
        }
        return arr; 
    }
}