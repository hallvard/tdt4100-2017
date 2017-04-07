package of13;

public class FollowerAccount extends TwitterAccount {

	public FollowerAccount(String username) {
		super(username);
	}

	@Override
	public void newTweet(Tweet tweet) {
		reTweet(tweet);		
	}
	
	public static void main(String[] args) {
		TwitterAccount gse = new GeneralAccount("GSElevator");
		TwitterAccount f1 = new FollowerAccount("Follower1");
		TwitterAccount f2 = new FollowerAccount("Follower2");
		TwitterAccount f3 = new FollowerAccount("Follower3");
		
		Tweet t1 = new Tweet(gse, "Blah blah blah");
		Tweet t2 = new Tweet(f1, t1);
		new Tweet(f2, t2);
		new Tweet(f3, t1);
		
		int nTweets = t1.getNumberOfRetweets();
		System.out.println(nTweets);
	}
	
	
}
