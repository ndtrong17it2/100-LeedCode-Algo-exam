class AddDigits258 {
    public int addDigits(int num) {
        int result = num % 10;
        while(num / 10 != 0){
            num = num / 10;
            result += num % 10;
        }
        if(result / 10 != 0){
            return addDigits(result);
        }
        return result;
    }
}