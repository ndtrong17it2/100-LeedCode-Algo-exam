class ReverseOnlyLetters917 {
    public String reverseOnlyLetters(String S) {
        char[] chars = S.toCharArray();
        int i = 0, j = chars.length - 1;

        while(j > i){
            if(i == j) break;
            if(chars[i] == chars[j]) {
                i++;
                j--;
                continue;
            }
            if(isLetter(chars[i]) && isLetter(chars[j])){
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            }else if(!isLetter(chars[i]) && isLetter(chars[j])){
                i++;
            }else if(isLetter(chars[i]) && !isLetter(chars[j])){
                j--;
            }else{
                i++;
                j--;
            }
            
        }
        return new String(chars);
    }
    public boolean isLetter(char c){
        if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) return true;
        return false;
    }
}