class ArrangingCoints441 {
    public int arrangeCoins(int n) {
        int total = 0;
        int row = 0;
        while(n > 0){
            row++;
            if(row <= n) total++;;
            n -= row;
        }
        return total;
    }
}