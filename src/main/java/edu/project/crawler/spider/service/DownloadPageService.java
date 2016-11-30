package edu.project.crawler.spider.service;

import edu.project.crawler.spider.entity.Page;

/**
 * Provides download page interface. Implement this interface can download page content.
 * @author Administrator
 *
 */
public interface DownloadPageService {
	public Page download(String url);
}
