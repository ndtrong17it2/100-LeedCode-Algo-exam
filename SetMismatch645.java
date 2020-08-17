class SetMismatch645 {
    public int[] findErrorNums(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int dupNum = Integer.MIN_VALUE, missNum = Integer.MIN_VALUE;
        for (int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int i = 1; i <= nums.length; i++){
            if (map.containsKey(i)){
                if (map.get(i) == 2) dupNum = i;
            }else missNum = i;
        }
        return new int[]{dupNum, missNum};
    }
}