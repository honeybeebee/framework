package examples.weibo4j.examples.account;

import weibo4j.Account;
import weibo4j.model.WeiboException;
import weibo4j.org.json.JSONObject;
import examples.weibo4j.examples.oauth2.Log;

public class GetUid {

	public static void main(String[] args) {
		String access_token = args[0];
		Account am = new Account(access_token);
		try {
			JSONObject uid = am.getUid();
			Log.logInfo(uid.toString());
		} catch (WeiboException e) {
			e.printStackTrace();
		}
	}
}
