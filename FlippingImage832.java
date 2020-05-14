class FlippingImage832 {
    public int[][] flipAndInvertImage(int[][] A) {
        for(int[] row: A){
            revert(row);
            for(int j = 0; j < row.length; j++){
                invert(row, j);
            }
        }
        return A;
    }
    
    public void revert(int[] arrays){
        int right = arrays.length - 1;
        int left = 0;
        while(left < right){
            swap(arrays, left++, right--);
        }
    }
    
    public void swap(int[] arrays, int a, int b){
        int temp = arrays[a];
        arrays[a] = arrays[b];
        arrays[b] = temp;
    }
    
    public void invert(int[] arrays, int index){
        arrays[index] = arrays[index] == 0 ? 1 : 0;
    }
}