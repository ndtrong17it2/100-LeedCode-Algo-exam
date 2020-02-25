class LongestHarmoniousSubsequence594 {
    public int findLHS(int[] nums) {
        Map<Integer, Long> map = Arrays.stream(nums).boxed()
            .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        TreeMap<Integer, Long> treeMap = new TreeMap<>(map);
        int prevKey = Integer.MAX_VALUE;
        int diffCount = 0;
        for(int key: treeMap.keySet()){
            Long currentDiffCount = 0L;
            if(key - prevKey == 1){
                currentDiffCount = treeMap.get(key) + treeMap.get(prevKey);
            }
            int currentDiffInt = currentDiffCount.intValue();
            prevKey = key;
            diffCount = currentDiffInt > diffCount ? currentDiffInt : diffCount;
        }
        return diffCount;
    }
}