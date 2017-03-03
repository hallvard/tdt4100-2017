package interfaces;

public class StringComparerInverter implements StringComparer {

	private final StringComparer other;
	
	public StringComparerInverter(StringComparer other) {
		this.other = other;
	}

	@Override
	public boolean lessThan(String s1, String s2) {
		return ! other.lessThan(s1, s2);
	}

}
