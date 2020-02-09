class RelativeRanks506 {
    public String[] findRelativeRanks(int[] nums) {
        String[] ranks = new String[nums.length];
        Map<Integer, String> mapRanks = new HashMap<Integer, String>(indexRanks(nums));
        for(int i = 0; i < nums.length; i++) {
			ranks[i] = mapRanks.get(nums[i]);
		}
        return ranks;
    }
    public Map<Integer, String> indexRanks(int[] nums) {
        int[] indexRanks = nums.clone();
        Map<Integer, String> mapRanks = new HashMap<Integer, String>();
        Arrays.sort(indexRanks);
        int indexMap = 1;
        for(int i = indexRanks.length - 1; i >= 0; i--){
            switch(indexMap){
                case 1: {
                    mapRanks.put(indexRanks[i], "Gold Medal");
                    break;
                }
                case 2: {
                    mapRanks.put(indexRanks[i], "Silver Medal");
                    break;
                }
                case 3: {
                    mapRanks.put(indexRanks[i], "Bronze Medal");
                    break;
                }
                default:{
                    mapRanks.put(indexRanks[i], String.valueOf(indexMap));
                    break;
                }
            }
            
            indexMap++;
        }
        return mapRanks;
    }
}