package examples.weibo4j.examples.favorites;

import weibo4j.Favorite;
import examples.weibo4j.examples.oauth2.Log;
import weibo4j.model.WeiboException;

public class DestroyFavoritesTagsBatch {

	public static void main(String[] args) {
		String access_token = args[0];
		Favorite fm = new Favorite(access_token);
		boolean result = false;
		String ids = args[1];
		try {
			result = fm.destroyFavoritesTagsBatch(ids);
			Log.logInfo(String.valueOf(result));
		} catch (WeiboException e) {

			e.printStackTrace();
		}
	}

}