package of13;

import java.util.ArrayList;
import java.util.Arrays;

public class PoliceAccount extends TwitterAccount {

	public PoliceAccount(String username) {
		super(username);
	}

	@Override
	public void newTweet(Tweet tweet) {
		if (tweet.getNumberOfRetweets() < 3) {
			System.out.println(tweet.getTwitterAccount().username +
					" tweeted a very weird Tweet");
		} else {
			System.out.println(tweet.getTwitterAccount().username +
					" tweeted a nice and very ordinary tweet with " +
					tweet.getNumberOfRetweets() + " retweets.");
		}
	}
	
	public static void main(String[] args) {
		TwitterAccount gse = new GeneralAccount("GSElevator");
		TwitterAccount f1 = new FollowerAccount("F1");
		TwitterAccount f2 = new FollowerAccount("F2");
		TwitterAccount f3 = new FollowerAccount("F3");
		
		f1.follow(gse); f2.follow(gse); f3.follow(f1);
		f3.follow(f2);
		
		PoliceAccount police = new PoliceAccount("The Police");
		police.followAll(new ArrayList<TwitterAccount>(
				Arrays.asList(new TwitterAccount[]{
						gse, f1, f2, f3
				})));
		gse.tweet("Blah blah blah");
	}

}
