class ArrayPartitionI561 {
    public int arrayPairSum(int[] nums) {
        List<Integer> listSort = Arrays.stream(nums).boxed().sorted().collect(Collectors.toList());
        return IntStream.range(0, listSort.size()).filter(i -> i % 2 == 0).mapToObj(i -> listSort.get(i)).collect(Collectors.summingInt(Integer::intValue));
    }
}