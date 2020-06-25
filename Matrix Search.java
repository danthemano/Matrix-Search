class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0)
            return false;

        int rows = matrix.length;
        int cols = matrix[0].length;
        int min = 0;
        int max = (rows * cols) - 1 ;

        //this does a binary search over the whole matrix
        while(min <= max){
            int mid = min + (max - min) / 2;

            if(matrix[mid/cols][mid%cols] == target)
                return true;

            else if(matrix[mid/cols][mid%cols] > target)
                max = mid - 1;

            else
                min = mid + 1;
        }
        return false;
    }
}