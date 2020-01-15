class UncommonWordsFromTwoSentences884 {
    public String[] uncommonFromSentences(String A, String B) {
        List<String> uncommonList = new ArrayList<String>();
        List<String> list = Stream.of(A.split(" "), B.split(" ")).flatMap(Stream::of).collect(Collectors.toList());
        list.forEach(e ->{
            if(Collections.frequency(list, e.trim()) == 1){
                uncommonList.add(e);
            }
        });
        return uncommonList.stream().toArray(String[]::new);
    }
}