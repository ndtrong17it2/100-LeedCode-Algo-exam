class PrimeNumberOfSetBits762 {
    public int countPrimeSetBits(int L, int R) {
        Stream<String> streamString =  IntStream.range(L, R + 1).mapToObj(num -> {
            return String.valueOf(Integer.parseInt(Integer.toBinaryString(num)));
        });
        return (int)streamString.filter(binString -> isPrime(countOne(binString))).count();
    }
    public boolean isPrime(int num){
        if(num <= 1) return false;
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public int countOne(String binString){
        return (int)Stream.of(binString.split("")).filter(bin -> bin.equals("1")).count();
    }
}