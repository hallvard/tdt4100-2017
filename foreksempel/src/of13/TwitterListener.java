package of13;

public interface TwitterListener {

	// TwitterListener-grensesnittet krever at alle
	// implementasjoner må ha metoder for å reagere
	// på et endringsobjekt tweet
	void newTweet(Tweet tweet);
	
}
