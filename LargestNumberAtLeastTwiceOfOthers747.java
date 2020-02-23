class LargestNumberAtLeastTwiceOfOthers747 {
    public int dominantIndex(int[] nums) {
        if(nums.length == 1) return 0;
        int max = nums[0], indexMax = 0, indexLessMax = nums.length - 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
                indexLessMax = indexMax;
                indexMax = i;
            }else if(nums[i] > nums[indexLessMax]){
                indexLessMax = i;
            }
        }
        return (indexMax != indexLessMax && max >= nums[indexLessMax] * 2) ? indexMax : -1;
    }
}