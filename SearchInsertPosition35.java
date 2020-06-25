class SearchInsertPosition35 {
    public int searchInsert(int[] nums, int target) {
        int indexIfNotFound = 0;
        boolean isOutIndex = false;
        if(target > nums[nums.length - 1]){
            return nums.length;
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                return i;
            }
            if(nums[i] > target && !isOutIndex){
                indexIfNotFound = i;
                isOutIndex = true;
            }
        }
        
        return indexIfNotFound;
    }
}