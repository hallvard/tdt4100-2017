package interfaces;

public class StringLengthComparer implements StringComparer {

	@Override
	public boolean lessThan(String s1, String s2) {
		return s1.length() < s2.length();
	}
}
