package examples.weibo4j.examples.timeline;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

import weibo4j.Timeline;
import weibo4j.http.ImageItem;
import weibo4j.model.Status;
import weibo4j.util.WeiboConfig;

public class Upload {
	public static void main(String args[]) {
		try {
			try {
				byte[] content = readFileImage("E:/Program Files (x86)/apache-tomcat-7.0.56-nplus/webapps/oppo/resource/yangy/img/pcLogo.png");
				System.out.println("content length:" + content.length);
				ImageItem pic = new ImageItem("pic", content);
				String s = java.net.URLEncoder.encode("#充电5分钟咩咩2小时#@杨洋icon 喊你来预约OPPO R9杨洋定制版啦！现在预约还有独家杨洋明信片、笔记本附赠！快戳https://pages.tmall.com/wow/tmall-3c/act/r9yangyang免费体验咩咩phone最新功能吧！", "utf-8");
				String access_token = "2.00nNm4rB3JW__Cfc65f993f0oTYMBE";
				Timeline tm = new Timeline(access_token);
				System.out.println("发送的微博："+s);
				Status status = tm.uploadStatus(s, pic);

				System.out.println("Successfully upload the status to ["
						+ status.getText() + "].");
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		} catch (Exception ioe) {
			System.out.println("Failed to read the system input.");
		}
	}

	public static byte[] readFileImage(String filename) throws IOException {
		BufferedInputStream bufferedInputStream = new BufferedInputStream(
				new FileInputStream(filename));
		int len = bufferedInputStream.available();
		byte[] bytes = new byte[len];
		int r = bufferedInputStream.read(bytes);
		if (len != r) {
			bytes = null;
			throw new IOException("读取文件不正确");
		}
		bufferedInputStream.close();
		return bytes;
	}
}
