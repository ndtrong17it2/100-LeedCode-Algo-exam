class FindAllNumbersDisappearedInAnArray448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        if(nums.length == 0){
            return new ArrayList<Integer>();
        }
        
        Set<Integer> list = new TreeSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            
                list.add(nums[i]);
            
        }
        int[] listSet = list.stream().mapToInt(Integer::intValue).toArray();
        
        List<Integer> list2 = new ArrayList<Integer>();
        
        for(int i = 0; i < listSet.length - 1; i++){
            if(listSet[i + 1] - listSet[i] != 1){
                list2.addAll(IntStream.range(listSet[i] + 1, listSet[i + 1]).boxed().collect(Collectors.toList()));
            }
        }
        if(listSet[0] != 1){
          list2.addAll(IntStream.range(1, listSet[0]).boxed().collect(Collectors.toList()));
        }
        if(listSet[listSet.length - 1] != nums.length){
          list2.addAll(IntStream.range(listSet[listSet.length - 1] + 1, nums.length + 1).boxed().collect(Collectors.toList()));
        }
        return list2;
    }
}