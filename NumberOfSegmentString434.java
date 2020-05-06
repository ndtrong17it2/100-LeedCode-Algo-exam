class NumberOfSegmentString434 {
    public int countSegments(String s) {
        char[] chars = s.trim().toCharArray();
        if(chars.length == 0) return 0;
        int segments = 0;
        
        for(int i = 0; i < chars.length - 1; i++){
            if(chars[i] == 32 && chars[i + 1] != 32){
                segments++;
            }
        }
        return segments + 1;
    }
}