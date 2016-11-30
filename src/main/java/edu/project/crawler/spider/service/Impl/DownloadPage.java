package edu.project.crawler.spider.service.Impl;

import edu.project.crawler.spider.entity.Page;
import edu.project.crawler.spider.service.DownloadPageService;
import edu.project.crawler.spider.util.PageDownloadUtil;
/**
 * Implements download page function. 
 * @author Administrator
 *
 */
public class DownloadPage implements DownloadPageService {

	public Page download(String url) {
		Page page = new Page();
		page.setContent(PageDownloadUtil.getPageContent(url));
		return page;
	}

}
