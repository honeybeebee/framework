package examples.weibo4j.examples.timeline;

import java.net.URLEncoder;

import weibo4j.Timeline;
import examples.weibo4j.examples.oauth2.Log;
import weibo4j.model.Status;
import weibo4j.model.WeiboException;
import weibo4j.util.URLEncodeUtils;

public class UpdateStatus {

	public static void main(String[] args) {
		String access_token = "2.00NDZIPE3JW__Cc632a19832Az_5bB";
		String statuses = "接口测试测试,http://baidu.com,来自@单曲-独奏";
		Timeline tm = new Timeline(access_token);
		try {
			Status status = tm.updateStatus(statuses);
			Log.logInfo(status.toString());
		} catch (WeiboException e) {
			e.printStackTrace();
		}	
	}

}
