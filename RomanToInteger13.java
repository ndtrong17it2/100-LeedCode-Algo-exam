class RomanToInteger13 {
    public int romanToInt(String s) {
        char[] romans = s.toCharArray();
        int integerNum = 0;
        for(int i = romans.length - 1; i >= 0; i--){
            integerNum += romanNumberToInt(romans[i]);
            if(romans[i] == 'I' && i < romans.length - 1){
                if(romans[i + 1] == 'V' || romans[i + 1] == 'X'){
                    integerNum -= romanNumberToInt(romans[i]) * 2;
                }
            }
            if(romans[i] == 'X' && i < romans.length - 1){
                if(romans[i + 1] == 'L' || romans[i + 1] == 'C'){
                    integerNum -= romanNumberToInt(romans[i]) * 2;
                }
            }
            if(romans[i] == 'C' && i < romans.length - 1){
                if(romans[i + 1] == 'D' || romans[i + 1] == 'M'){
                    integerNum -= romanNumberToInt(romans[i]) * 2;
                }
            }
        }
        return integerNum;
    }
    public int romanNumberToInt(char romanNum){
        switch(romanNum){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }
}

