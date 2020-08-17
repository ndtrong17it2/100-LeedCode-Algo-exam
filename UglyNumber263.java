class UglyNumber263 {
    public boolean isUgly(int num) {
        if (num <= 0) return false;
        int[] acceptNum = new int[]{2, 3, 5};
        for(int n: acceptNum){
            while(num % n == 0){
                num /= n;
            }
        }
        return num == 1;
    }
}