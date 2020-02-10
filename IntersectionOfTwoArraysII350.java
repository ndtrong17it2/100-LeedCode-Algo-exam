class IntersectionOfTwoArraysII350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length){
            return intersectionArrays(nums2, nums1);
        }
        
        return intersectionArrays(nums1, nums2);
    }
    public int[] intersectionArrays(int[] nums1, int[] nums2){
        List<Integer> listInters = new ArrayList<Integer>();
        List<Integer> removeNums1 = new ArrayList<Integer>();
        List<Integer> removeNums2 = new ArrayList<Integer>();
        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j] && !removeNums1.contains(i) && !removeNums2.contains(j)){
                    listInters.add(nums1[i]);
                    removeNums1.add(i);
                    removeNums2.add(j);
                    break;
                }
            }
        }
        return listInters.stream().mapToInt(Integer::intValue).toArray();
    }
}