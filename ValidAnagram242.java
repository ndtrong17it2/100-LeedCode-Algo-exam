class ValidAnagram242 {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        Arrays.sort(charS);
        Arrays.sort(charT);
        int i = 0;
        while(i < charS.length){
            if(charS[i] == charT[i]) i++;
            else return false;
        }
        return true;
    }
}