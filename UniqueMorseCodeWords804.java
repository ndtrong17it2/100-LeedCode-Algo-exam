import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UniqueMorseCodeWords804 {
	
    static final String[] morseCodes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

	public static int func(String[] words) {
		Set<String> uniqMorse = new HashSet<String>();
		Stream<String> stream = Arrays.stream(words);
		stream.forEach(word -> {
			Stream<Integer> charIntStream = CharBuffer.wrap(word.toCharArray()).chars().mapToObj(ch -> (int) ch);
			String morseCode = charIntStream.map(code -> morseCodes[code - 97]).collect(Collectors.joining());
			uniqMorse.add(morseCode);
		});
		return uniqMorse.size();
	}

}
