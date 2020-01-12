class KeyboardRow500 {
    public String[] findWords(String[] words) {
        List<String> rowTop = Arrays.asList("q", "w", "e", "r", "t", "y", "u", "i", "o", "p");
        List<String> rowMiddle = Arrays.asList("a", "s", "d", "f", "g", "h", "j", "k", "l");
        List<String> rowBottom = Arrays.asList("z", "x", "c", "v", "b", "n", "m");
        List<String> result = new ArrayList<String>();
        Stream.of(words).forEach(word ->{
            List<String> character = Arrays.asList(word.toLowerCase().split(""));
            if(rowTop.containsAll(character) || rowMiddle.containsAll(character) || rowBottom.containsAll(character)){
                result.add(word);
            }
        });
        return result.stream().toArray(String[]::new);
    }
}