class SingleNumber136 {
    public int singleNumber(int[] nums) {
        List<Integer> singleList = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++){
            int current = nums[i];
            if(singleList.contains(nums[i])){
                singleList.remove(Integer.valueOf(nums[i]));
            }else{
                singleList.add(current);
            }
        }
        return singleList.get(0);
    }
}