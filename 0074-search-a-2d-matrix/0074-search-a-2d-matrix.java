class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int low=0;
        int high=m*n-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int rows=mid/m;
            int cols=mid%m;
            int val=matrix[rows][cols];
            if(val==target)
            {
                return true;
            }
            else if(val<target)
            {
                low=mid+1;
                
            }
            else{
               high=mid-1;
            }
        }
        return false;
        
    }
}