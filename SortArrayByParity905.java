class SortArrayByParity905 {
    public int[] sortArrayByParity(int[] A) {
        int mouse = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] % 2 == 0){
                swap(i, mouse, A);
                mouse++;
            }
        }
        return A;
    }
    public void swap(int first, int second, int[] arrays){
        int temp = arrays[first];
        arrays[first] = arrays[second];
        arrays[second] = temp;
    }
}