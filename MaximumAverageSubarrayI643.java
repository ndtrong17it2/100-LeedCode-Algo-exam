class MaximunAverageSubarrayI643 {
    public double findMaxAverage(int[] nums, int k) {
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i <= nums.length - k; i++){
            int sum = 0;
            for(int j = i; j < i + k; j++){
                sum += nums[j];
            }
            maxSum = maxSum < sum ? sum : maxSum;
        }
        return (double)maxSum / k;
    }
}