class RansomNote383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length() < ransomNote.length()){
            return false;
        }
        char[] ransomNotes = ransomNote.toCharArray();
        char[] magazines = magazine.toCharArray();
        int numberOfRemoved = 0;
        for(int i = 0; i < ransomNotes.length; i++){
            for(int j = 0; j < magazines.length; j++){
                if(j == magazines.length - 1 && ransomNotes[i] != magazines[j]){
                    return false;
                }
                if(ransomNotes[i] == magazines[j]){
                    ransomNote = ransomNote.substring(i + 1 - numberOfRemoved, ransomNote.length());
                    magazines[j] = ' ';
                    numberOfRemoved++;
                    break;
                }
                
            }
        }
        return true;
    }
}