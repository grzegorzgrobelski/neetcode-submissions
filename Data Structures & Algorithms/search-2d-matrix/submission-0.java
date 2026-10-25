class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i= 0; i <= matrix.length-1; i ++) {
            if (matrix[i][0] <= target && target <= matrix[i][matrix[i].length-1]) {
                int l = 0; 
                int r = matrix[i].length-1; 
                while (l <= r){
                    int mid = l + (r-l)/2;

                    if (matrix[i][mid] == target) return true;
                    else if (matrix[i][mid] < target) {
                        l = mid +1;
                    } else {
                        r = mid -1;
                    }
                }
            } else {
                continue;
            }
        }

        return false;
    }
}
