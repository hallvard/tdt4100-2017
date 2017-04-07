package of13;

import java.util.ArrayList;
import java.util.List;

public abstract class TwitterAccount implements TwitterListener {
	
	private List<Tweet> tweets = new ArrayList<>();
	protected String username;
	// Felter for observerbarhet
	private List<TwitterListener> listeners = new ArrayList<>();
	
	public TwitterAccount(String username) {
		this.username = username;
	}
	
	public void addListener(TwitterListener listener) {
		if (!listeners.contains(listener)) {
			listeners.add(listener);
		}
	}
	
	public void follow(TwitterAccount twitterAccount) {
		twitterAccount.addListener(this);
	}
	public void followAll(ArrayList<TwitterAccount> accounts) {
		for (TwitterAccount account : accounts) {
			follow(account);
		}
	}
	public void removeListener(TwitterListener listener) {
		if (listeners.contains(listener)) {
			listeners.remove(listener);
		}
	}
	public int getNumberOfFollowers() {
		return listeners.size();
	}
	
	public void tweet(String text) {
		Tweet t = new Tweet(this, text);
		tweets.add(t);
		System.out.println(username + " tweets \"" +
				text + "\"");
		fireNewTweet(t);
	}
	
	public void reTweet(Tweet tweet) {
		Tweet t = new Tweet(this, tweet);
		tweets.add(t);
		System.out.println(username + " retweets \"" +
				tweet.getText() + "\"");
		fireNewTweet(t);
	}
	
	// Løkker over lytterne/følgerne
	// og kaller newTweet-metoden
	private void fireNewTweet(Tweet t) {
		for (TwitterListener listener : listeners) {
			//System.out.println(username + " oppdaterer observatør "+
			//		((TwitterAccount) listener).username);
			listener.newTweet(t);
		}
	}
		
}
