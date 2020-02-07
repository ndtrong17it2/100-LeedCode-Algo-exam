class MajorityElement169 {
    public int majorityElement(int[] nums) {
        if(nums.length < 1) return 0;
        if(nums.length < 2) return nums[0];
        int major = 0;
        int element = 0;
        for(int i = 0; i < nums.length - 1; i++){
            int temp = nums[i];
            int countMajor = 1;
            for(int j = i + 1; j < nums.length; j++){
                if(temp == nums[j]){
                    countMajor++;
                }
            }
            
            if(major <= countMajor && countMajor >= (nums.length / 2)){
                major = countMajor;
                element = temp;
                
            }
            
        }
        return element;
    }
}