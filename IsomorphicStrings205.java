class IsomorphicStrings205 {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() <= 1){
            return true;
        }
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        for(int i = 0; i < charS.length - 1; i++){
            for(int j = 1; j < charT.length; j++){
                if(charS[i] == charS[j]){
                    if(charT[i] != charT[j]){
                        return false;    
                    }
                }else{
                    if(charT[i] == charT[j]){
                        return false;    
                    }
                }
            }
        }
        return true;
    }
}