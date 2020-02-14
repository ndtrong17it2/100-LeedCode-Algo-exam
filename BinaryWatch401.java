class BinaryWatch401 {
    public List<String> readBinaryWatch(int num) {
        List<String> result = new ArrayList<String>();
        for(int h = 0; h < 12; h++){
            for(int m = 0; m < 60; m++){
                if(num == Integer.bitCount(h) + Integer.bitCount(m)){
                    String minusFormat = m < 10 ? ("0" + m) : (m + "");
                    String time = h + ":" + minusFormat;
                    result.add(time);
                }
            }
        }
        return result;
    }
}