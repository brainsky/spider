package edu.project.crawler.spider.service.Impl;
import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.TagNode;

import edu.project.crawler.spider.entity.Page;
import edu.project.crawler.spider.service.AnalysisPageService;

public class YouKuAnalysis implements AnalysisPageService {

	public void analysis(Page page) {
		HtmlCleaner htmlCleaner = new HtmlCleaner();
		String content = page.getContent();
		TagNode rootNode = htmlCleaner.clean(content);
		
	}

}
