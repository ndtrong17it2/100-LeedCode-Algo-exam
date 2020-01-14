class BinaryNumberWithAlternatingBits693 {
    public boolean hasAlternatingBits(int n) {
        String[] characters = Integer.toBinaryString(n).split("");
        return IntStream.range(0, characters.length - 1).allMatch(i -> !characters[i].equals(characters[i + 1]));
    }
}