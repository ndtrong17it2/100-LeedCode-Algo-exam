class LongestContinuousIncreasingSubsequence674 {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length == 0) return 0;
        int prevLCIS = 0, currentLCIS = 1;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] < nums[i + 1]){
                currentLCIS++;
            }else{
                prevLCIS = Math.max(currentLCIS, prevLCIS);
                currentLCIS = 1;
            }
        }
        if(currentLCIS > prevLCIS){
            prevLCIS = currentLCIS;
        }
        return prevLCIS;
    }
}