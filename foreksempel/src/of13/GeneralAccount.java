package of13;

public class GeneralAccount extends TwitterAccount {
	
	public GeneralAccount(String username) {
		super(username);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void newTweet(Tweet tweet) {
		System.out.println(tweet.getTwitterAccount().username + 
				" just tweeted:\n\t" +
				"\"" + tweet.getText() + "\"");
	}

}
