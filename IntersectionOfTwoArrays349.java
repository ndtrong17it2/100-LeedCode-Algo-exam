class IntersectionOfTwoArrays349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> sets1 = new HashSet<Integer>();
        for(int num : nums1){
            sets1.add(num);
        }
        Set<Integer> sets2 = new HashSet<Integer>();
        for(int num : nums2){
            sets2.add(num);
        }
        sets1.removeIf(e -> !sets2.contains(e));
        
        return sets1.stream().mapToInt(Integer::intValue).toArray();
    }
}