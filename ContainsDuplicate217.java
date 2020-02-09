class ContainsDuplicate217 {
    public boolean containsDuplicate(int[] nums) {
        HashSet hs = new HashSet();
        for(int num: nums){
            hs.add(num);
        }
        return hs.size() == nums.length ? false : true;
    }
}