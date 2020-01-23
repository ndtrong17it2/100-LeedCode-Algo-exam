class FindTheDifference389 {
    public char findTheDifference(String s, String t) {
        char[] charsT = t.toCharArray();
        char[] charsS = s.toCharArray();
        int checkSum = 0;
        for(int i = 0; i < charsT.length; i++){
            checkSum += (int) charsT[i];
        }
        for(int i = 0; i < charsS.length; i++){
            checkSum -= charsS[i];
        }
        return (char)checkSum;
    }
}