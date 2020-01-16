class MoveZeroes283 {
    public void moveZeroes(int[] nums) {
        int mouse = 0;
        for(int i = 0; i < nums.length; i ++){
            if(nums[i] != 0){
                nums[mouse] = nums[i];
                mouse++;
            }
        }
        for(int i = mouse; i < nums.length; i++){
            nums[i] = 0;
        }
    }
}