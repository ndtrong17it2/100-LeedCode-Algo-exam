class TransposeMatrix867 {
    public int[][] transpose(int[][] A) {
        int[][] newMatrix = new int[A[0].length][A.length];
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[i].length; j++){
                newMatrix[j][i] = A[i][j];
            }
        }
        return newMatrix;
    }
}