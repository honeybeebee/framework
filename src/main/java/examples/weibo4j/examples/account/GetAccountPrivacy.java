package examples.weibo4j.examples.account;

import weibo4j.Account;
import weibo4j.model.Privacy;
import weibo4j.model.WeiboException;
import examples.weibo4j.examples.oauth2.Log;

public class GetAccountPrivacy {

	public static void main(String[] args) {
		String access_token = args[0];
		Account am = new Account(access_token);
		try {
			Privacy privacy = am.getAccountPrivacy();
			Log.logInfo(privacy.toString());
		} catch (WeiboException e) {
			e.printStackTrace();
		}
	}
}

