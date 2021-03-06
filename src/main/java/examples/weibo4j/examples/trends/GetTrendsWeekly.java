package examples.weibo4j.examples.trends;

import java.util.List;

import weibo4j.Trend;
import examples.weibo4j.examples.oauth2.Log;
import weibo4j.model.Trends;
import weibo4j.model.WeiboException;

public class GetTrendsWeekly {

	public static void main(String[] args) {
		String access_token = args[0];
		Trend tm = new Trend(access_token);
		try {
			List<Trends> trends = tm.getTrendsWeekly();
			for(Trends ts : trends){
				Log.logInfo(ts.toString());
			}
		} catch (WeiboException e) {
			e.printStackTrace();
		}
	}

}
