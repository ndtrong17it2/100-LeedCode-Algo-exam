class ReshapeMatrix566 {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int sourceShape = nums.length * nums[0].length;
        int desShape = r * c;
        if(sourceShape != desShape) return nums;
        List<Integer> flat = new ArrayList<Integer>();
        int[][] desMatrix = new int[r][c];
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[i].length; j++){
                flat.add(nums[i][j]);
            }
        }
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                desMatrix[i][j] = flat.get(0);
                flat.remove(0);
            }
        }
        return desMatrix;
    }
}