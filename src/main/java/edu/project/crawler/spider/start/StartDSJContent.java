package edu.project.crawler.spider.start;

import edu.project.crawler.spider.entity.Page;
import edu.project.crawler.spider.service.AnalysisPageService;
import edu.project.crawler.spider.service.DownloadPageService;
import edu.project.crawler.spider.service.Impl.DownloadPage;
import edu.project.crawler.spider.service.Impl.YouKuAnalysis;
import edu.project.crawler.spider.util.PageDownloadUtil;

/**
 * TV program start download entrance.
 * @author Administrator
 *
 */
public class StartDSJContent {
	private DownloadPageService downloadService;
	private AnalysisPageService analysisService;
	public AnalysisPageService getAnalysisService() {
		return analysisService;
	}
	public void setAnalysisService(AnalysisPageService analysisService) {
		this.analysisService = analysisService;
	}
	public DownloadPageService getDownloadService() {
		return downloadService;
	}
	public void setDownloadService(DownloadPageService downloadService) {
		this.downloadService = downloadService;
	}
	public void analysisTv(Page page){
		this.analysisService.analysis(page);
	}
	public Page downloadTV(String url){
		return  this.downloadService.download(url);
	}
	public static void main(String[] args) {
		String url="http://xiaoyuan.zhaopin.com/part/0/530_299_0_0_0_-1_0_1_0";
		StartDSJContent dsj = new StartDSJContent();
		dsj.setDownloadService(new DownloadPage());
		dsj.setAnalysisService(new YouKuAnalysis());
		Page page = dsj.downloadTV(url);
		dsj.analysisTv(page);
		System.out.print(page.getContent());
	}
}
