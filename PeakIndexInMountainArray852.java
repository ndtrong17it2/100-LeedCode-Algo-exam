class PeakIndexInMountainArray852 {
    public int peakIndexInMountainArray(int[] A) {
        return IntStream.range(0, A.length).reduce((i, j) -> A[i] < A[j] ? j : i).getAsInt();
    }
}