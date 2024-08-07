class Solution{
    public void setZeros(int[][] matrix) {
        //method 1: using extra space
        // int m = matrix.length;
        // int n = matrix[0].length;
        // boolean row[] = new boolean[m];
        // boolean col[] = new boolean[n];
        // for(int i = 0; i < m; i++){
        //     for(int j = 0; j < n; j++){
        //         if(matrix[i][j] == 0){
        //             row[i] = true;
        //             col[j] = true;
        //         }
        //     }
        // }
        // for(int i = 0; i < m; i++){
        //     for(int j = 0; j < n; j++){
        //         if(row[i] || col[j]){
        //             matrix[i][j] = 0;
        //         }
        //     }
        // }

        //method 2: using first row and first column as extra space
        int m = matrix.length;
        int n = matrix[0].length;
        boolean firstRow = false;
        boolean firstCol = false;
        for(int i = 0; i < m; i++){
            if(matrix[i][0] == 0){
                firstCol = true;
                break;
            }
        }
        for(int i = 0; i < n; i++){
            if(matrix[0][i] == 0){
                firstRow = true;
                break;
            }
        }
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        if(firstRow){
            for(int i = 0; i < n; i++){
                matrix[0][i] = 0;
            }
        }
        if(firstCol){
            for(int i = 0; i < m; i++){
                matrix[i][0] = 0;
            }
        }

    }
}
