package funksjoner;

import java.util.function.Predicate;

public class NtnuMailTester implements Predicate<Person> {

	@Override
	public boolean test(Person t) {
		String email = t.getEmail();
		return (email != null && email.endsWith("@ntnu.no"));
	}
}
