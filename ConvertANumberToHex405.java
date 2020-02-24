class ConvertANumberToHex405 {
    public String toHex(int num) {
        return binaryToHex(Integer.toBinaryString(num));
    }
    public String binaryToHex(String bin){
        String result = "";
        for(int i = bin.length() - 1; i >= 0; i -= 4){
            int j = i;
            int bit4result = 0;
            int bit4 = 4;
            while(bit4 > 0 && j > -1){
                if(bin.charAt(j) == '1'){
                    bit4result += Math.pow(2, i - j);
                }
                j--;
                bit4--;
            }
            result = hexNum(bit4result) + result;
        }
        return result;
    }
    public String hexNum(int hex){
        switch(hex){
            case 10: return "a";
            case 11: return "b";
            case 12: return "c";
            case 13: return "d";
            case 14: return "e";
            case 15: return "f";
        }
        return String.valueOf(hex);
    }
}