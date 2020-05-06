class RemoveDuplicatesSortedArray26 {
    public int removeDuplicates(int[] nums) {
        int length = 0;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] != nums[i + 1]){
                nums[++length] = nums[i + 1];
            }
        }
        return length + 1;
    }
}