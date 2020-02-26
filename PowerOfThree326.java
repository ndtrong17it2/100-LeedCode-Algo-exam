class PowerOfThree326 {
    public boolean isPowerOfThree(int n) {
        if(n <= 0) return false;
        if(n == 1) return true;
        int sumDigits = 0;
        while(n > 1){
            if(n % 3 != 0) return false;
            n /= 3;
        }
        return true;
    }
}