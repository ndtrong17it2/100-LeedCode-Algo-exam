class FizzBuzz412 {
    public List<String> fizzBuzz(int n) {
        return IntStream.range(1, n + 1).mapToObj(num->{
            if(num % 3 == 0 && num % 5 == 0) return "FizzBuzz";
            if(num % 3 == 0) return "Fizz";
            if(num % 5 == 0) return "Buzz";
            return String.valueOf(num);
        }).collect(Collectors.toList());
    }
}