class FindPivotIndex724 {
    public int pivotIndex(int[] nums) {
        if(nums.length == 1) return 0;
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            int tempSum = 0;
            for(int j = i + 1; j < nums.length; j++){
                tempSum += nums[j];
            }
            if(sum == tempSum){
                return i;
            }
            sum += nums[i];
        }
        return -1;
    }
}