class Solution {
    public int binarysearch(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]<target)
                low=mid+1;
            else
                high=mid-1;
        }
    return -1;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++){
            if(matrix[i][0]<=target && target<=matrix[i][n-1]){
                int res=binarysearch(matrix[i],target);
                if(res!=-1)
                    return true;
            }
             
        }
        return false;
    }
}