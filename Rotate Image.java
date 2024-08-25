class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int layers = n/2;
        for(int layer = 0; layer< layers; layer++){
            int start = layer;
            int end = n-1-layer;

            for(int i = start; i<end; i++){
                int temp = matrix[start][i];
                matrix[start][i]=matrix[n-1-i][start];
                matrix[n-1-i][start] = matrix[end][n-1-i];
                matrix[end][n-1-i] = matrix[i][end];
                matrix[i][end]= temp;
            }
        }
    }
}
