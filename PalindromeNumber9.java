class PalindromeNumber9 {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        char[] nums = String.valueOf(x).toCharArray();
        int index = 0;
        while(index <= nums.length / 2){
            int backward = nums[index];
            int forward = nums[nums.length - 1 - index];    
            if(backward != forward) return false;
            index++;
        }
        return true;
    }
}