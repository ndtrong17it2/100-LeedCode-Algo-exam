class ReverseInteger7 {
    public int reverse(int x) {
        int srcX = Math.abs(x);
        long desX = 0;
        while(srcX > 0){
            int length = (int)(Math.log10(srcX)+1);
            desX += (srcX % 10) * Math.pow(10, length - 1);
            srcX = srcX / 10;
        }
        if(desX < -Math.pow(2, 31) || desX > Math.pow(2, 31) - 1) return 0;
        return x < 0 ? (int)desX * (-1) : (int)desX;
    }
}