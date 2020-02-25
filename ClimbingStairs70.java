class ClimbingStairs70 {
    public int climbStairs(int n) {
        if(n == 1 || n == 2 || n == 3){
            return n;
        }
        int prev = 1, current = 2;
        for(int i = 3; i <= n; i++){
            int temp = prev;
            prev = current;
            current = current + temp;
            
        }
        return current;
    }
}