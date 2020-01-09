
public class JewelsAndStones771 {

	public int numJewelsInStones(String J, String S) {
		return S.length() - S.replaceAll(String.join("|", J.split("")), "").length();
	}

}
