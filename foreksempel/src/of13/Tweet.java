package of13;

import java.util.Collection;
import java.util.HashSet;

public class Tweet {
	
	private String text;
	private TwitterAccount twitterAccount;
	
	private Tweet reTweet;
	private Collection<Tweet> reTweets;
	
	public Tweet(TwitterAccount ta, String text) {
		this.twitterAccount = ta;
		this.text = text;
	}
	
	// Kan også ha en konstruktør for å lage retweets
	public Tweet(TwitterAccount ta, Tweet reTweet) {
		this(ta, reTweet.text); // Slipper å bruke getText() fordi vi er i "samme" klasse
		this.reTweet = reTweet;
		reTweet.addToRetweets(this);
	}

	// Adm. retweets-relasjoner
	private void addToRetweets(Tweet tweet) {
		if (reTweets == null) {
			reTweets = new HashSet<Tweet>();
		}
		reTweets.add(tweet);
	}
	
	// Gettere og settere
	public String getText() {
		return text;
	}
	
	public TwitterAccount getTwitterAccount() {
		return twitterAccount;
	}
	
	// Metoder for å søke i grafen/treet av retweets 
	public int getNumberOfRetweets() {
		HashSet<Tweet> tweetsVisited = new HashSet<>();
		tweetsVisited.add(this);
		// Rekursiv metode for å telle antall retweets
		// av this-tweeten
		return getNumberOfRetweets(this, tweetsVisited);
	}
	
	private static int getNumberOfRetweets(Tweet tweet,
			HashSet<Tweet> tweetsVisited) {
		if (tweet.reTweets == null) {
			return 0;
		} else {
			int count = 0;
			for (Tweet t : tweet.reTweets) {
				if (!(tweetsVisited.contains(t))) {
					tweetsVisited.add(t);
					count++;
					count += getNumberOfRetweets(t, tweetsVisited);
				}
			}
			return count;
		}
	}
	
}
