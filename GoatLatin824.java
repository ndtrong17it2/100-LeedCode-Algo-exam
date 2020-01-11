class GoatLatin824 {
    public String toGoatLatin(String S) {
        
        List<String> words = Arrays.stream(S.split(" ")).map(word -> {
            if(word.matches("(a|A|e|E|i|I|o|O|u|U).*")) {
                return word.concat("ma");
            }else{
                return word.concat(Character.toString(word.charAt(0))).concat("ma").substring(1);
            }
        }).collect(Collectors.toList());

        return IntStream.range(0, S.split(" ").length).mapToObj(index ->
            words.get(index).concat(String.join("", Collections.nCopies(index + 1, "a")))
        ).collect(Collectors.joining(" "));
    }
}