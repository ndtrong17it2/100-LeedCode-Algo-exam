class MaxConsecutiveOnes485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int previous = 0;
        int current = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                current++;
            }
            if(nums[i] == 0 || i == nums.length - 1){
                previous = current < previous ? previous : current;
                current = 0;
            }
        }
        return previous;
    }
}