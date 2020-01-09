import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SelfDividingNumbers728 {
	
	public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> listInRange = IntStream.range(left, right + 1).boxed().collect(Collectors.toList());
        
        return listInRange.stream().filter(number -> isSelfDiving(number)).collect(Collectors.toList());
    }
    
    public boolean isSelfDiving(int number){
        List<Integer> digits = Arrays.asList(String.valueOf(number).split("")).stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        return digits.stream().allMatch(digit -> (digit != 0 && number % digit == 0));
    }
}
