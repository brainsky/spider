package edu.project.crawler.spider.util;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import edu.project.crawler.spider.entity.Page;
import edu.project.crawler.spider.service.Impl.DownloadPage;
/**
 * Provides download page utils.
 * @author Administrator
 *
 */
public class PageDownloadUtil {
	
	public static String getPageContent(String url){
		HttpClientBuilder httpBuild = HttpClients.custom();
		CloseableHttpClient	client	= httpBuild.build();
		HttpGet request = new HttpGet(url);
		String content = null;
		try {
			CloseableHttpResponse response = client.execute(request);
			HttpEntity entity = response.getEntity();
			content = EntityUtils.toString(entity);
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return content;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "http://xiaoyuan.zhaopin.com/part/0/530_299_0_0_0_-1_0_1_0";
		DownloadPage dp = new DownloadPage();
		Page page = dp.download(url);
		System.out.print(page.getContent());
	}

}
