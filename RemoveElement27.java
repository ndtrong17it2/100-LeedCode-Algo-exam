class RemoveElement27 {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0) return 0;
        int len = nums.length;
        int index = 0;
        int newLength = 0;
        while(index < len){
            if(nums[index] != val){
                nums[newLength] = nums[index];
                newLength++;
            }
            index++;
        }
        return newLength;
    }
}