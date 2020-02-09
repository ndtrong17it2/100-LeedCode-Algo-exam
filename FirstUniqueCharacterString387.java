class FirstUniqueCharacterString387 {
    public int firstUniqChar(String s) {
        for(int i = 0; i < s.length(); i++){
            if(existChar(i, s)) continue;
            return i;
        }
        return -1;
    }
    public boolean existChar(int index, String s){
        char ch = s.charAt(index);
        int i = 0;
        while(i < s.length()){
            if(i != index && ch == s.charAt(i)){
                return true;
            }
            i++;
        }
        return false;
    }
}