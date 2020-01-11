class NumberComplement476 {
    public int findComplement(int num) {
        
        String flipBin = Integer.toBinaryString(~num);
        flipBin = flipBin.replaceFirst("^1*", "");
        
        return Integer.parseInt(flipBin, 2);
    }
}