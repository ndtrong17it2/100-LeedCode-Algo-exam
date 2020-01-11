class ReverseWordsInAStringIII557 {
    public String reverseWords(String s) {
        return Arrays.stream(s.split(" ")).map(word -> (new StringBuilder(word)).reverse()).collect(Collectors.joining(" "));
    }
}