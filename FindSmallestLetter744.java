class FindSmallestLetter744 {
    public char nextGreatestLetter(char[] letters, char target) {
        if(target >= letters[letters.length - 1] || target < letters[0]){
            return letters[0];
        }
        for(int i = letters.length - 1; i >= 0; i--){
            if(target >= letters[i]){
                return letters[i + 1];
            }
        }
        return letters[0];
    }
}