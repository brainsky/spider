package edu.project.crawler.spider.service;

import edu.project.crawler.spider.entity.Page;

/**
 * Provides user of analysis page interface. Implement this interface can analysis page.
 * @author Administrator
 *
 */
public interface AnalysisPageService {
	public void analysis(Page page);
}
