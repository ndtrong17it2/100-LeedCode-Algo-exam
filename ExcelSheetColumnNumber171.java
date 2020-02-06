class ExcelSheetColumnNumber171 {
    public int titleToNumber(String s) {
        int strLength;
        double numberOfColumn = 0;
        while((strLength = s.length()) > 0){
            numberOfColumn += Math.pow(26, strLength - 1) * (s.charAt(0) - 64);
            s = s.substring(1, strLength);
        }
        return (int)numberOfColumn;
    }
}