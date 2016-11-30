package edu.project.crawler.spider.entity;

/**
 * Store the page to the entity page, it seem likes a javabean.
 * @author Administrator
 *
 */
public class Page {
	//1.网址
	private String url;
	//2.节目名称
	private String tvname;
	//3.页面内容
	private String content;
	//4.演员
	private String actor;
	//5.评论数
	private String commentnumber;
	//6.赞
	private String suportnumber;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getTvname() {
		return tvname;
	}
	public void setTvname(String tvname) {
		this.tvname = tvname;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getCommentnumber() {
		return commentnumber;
	}
	public void setCommentnumber(String commentnumber) {
		this.commentnumber = commentnumber;
	}
	public String getSuportnumber() {
		return suportnumber;
	}
	public void setSuportnumber(String suportnumber) {
		this.suportnumber = suportnumber;
	}
	public String getAganistnumber() {
		return aganistnumber;
	}
	public void setAganistnumber(String aganistnumber) {
		this.aganistnumber = aganistnumber;
	}
	public String getTotalplay() {
		return totalplay;
	}
	public void setTotalplay(String totalplay) {
		this.totalplay = totalplay;
	}
	public String getDayplay() {
		return dayplay;
	}
	public void setDayplay(String dayplay) {
		this.dayplay = dayplay;
	}
	public String getSubitems() {
		return subitems;
	}
	public void setSubitems(String subitems) {
		this.subitems = subitems;
	}
	//7.踩
	private String aganistnumber;
	//8.总播放数
	private String totalplay;
	//9.日播放数
	private String dayplay;
	//10.子集
	private String subitems;
}
