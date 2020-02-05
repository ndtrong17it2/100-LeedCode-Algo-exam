class ConstructRectangle492 {
    public int[] constructRectangle(int area) {
        int[] rect = new int[2];
        rect[0] = area;
        rect[1] = 1;
        
        int diff = area - 1;
        for(int i = (int)Math.sqrt(area); i > 0; i--){
            if(area % i == 0){
                int currentDiff = Math.abs(i - (area / i));
                if(diff > currentDiff){
                    rect[1] = i;
                    rect[0] = area / i;
                    diff = currentDiff;
                }
            }
        }
        return rect;
    }
}