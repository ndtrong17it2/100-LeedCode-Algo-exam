class TwoSumII167 {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        breakpoint:
        for(int i = 0; i < numbers.length - 1; i++){
            int equalNum = target - numbers[i];
            for(int j = i + 1; j < numbers.length; j++){
                if(numbers[j] == equalNum){
                    result[0] = i + 1;
                    result[1] = j + 1;
                    break breakpoint;
                }
            }
        }
        return result;
    }
}