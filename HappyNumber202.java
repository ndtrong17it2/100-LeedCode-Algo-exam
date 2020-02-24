class HappyNumber202 {
    public boolean isHappy(int n) {
        while(String.valueOf(n).length() > 1){
            int currentSquaresSum = 0;
            while(n != 0){
                int mod = n % 10;
                currentSquaresSum += mod * mod;
                n /= 10;
            }
            n = currentSquaresSum;
        }
        return n == 1 || n == 7 ? true : false;
    }
}