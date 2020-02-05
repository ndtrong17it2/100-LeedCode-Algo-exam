class RangeAdditionII598 {
    public int maxCount(int m, int n, int[][] ops) {
        if(ops.length == 0) return m * n;
        int rowsOfMaxNum = m;
        int colsOfMaxNum = n;
        for(int i = 0; i < ops.length; i++){
            rowsOfMaxNum = rowsOfMaxNum <  ops[i][0] ? rowsOfMaxNum : ops[i][0];
            colsOfMaxNum = colsOfMaxNum <  ops[i][1] ? colsOfMaxNum : ops[i][1];
        }
        return rowsOfMaxNum * colsOfMaxNum ;
    }
}