class NextGreaterElementI496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        List<Integer> elements = new ArrayList<Integer>();
        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    if(j < nums2.length - 1 && nums1[i] < nums2[j + 1]){
                        elements.add(nums2[j + 1]);
                    }else if(j == nums2.length - 1){
                        elements.add(-1);
                    }else{
                        int greater = 0;
                        for(int k = j; k < nums2.length; k++){
                            if(nums1[i] < nums2[k]){
                                greater = nums2[k];
                                break;
                            }
                            greater = -1;
                        }
                        elements.add(greater);
                    }
                }
            }
        }
        return elements.stream().mapToInt(Integer::intValue).toArray();
    }
}