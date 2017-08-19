package com.kindArt.manager.json.Json018;

public class PublisherInfo {
	
	private String publisherID ;//发布人ID
	private String publisherName ;//发布人名称
	private String publisheTime ;//发布时间
	private String publisherHPURL ;//发布人头像地址
	private String isFollowed ;//是否关注发布人
	public String getPublisherID() {
		return publisherID;
	}
	public void setPublisherID(String publisherID) {
		this.publisherID = publisherID;
	}
	public String getPublisherName() {
		return publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	public String getPublisheTime() {
		return publisheTime;
	}
	public void setPublisheTime(String publisheTime) {
		this.publisheTime = publisheTime;
	}
	public String getPublisherHPURL() {
		return publisherHPURL;
	}
	public void setPublisherHPURL(String publisherHPURL) {
		this.publisherHPURL = publisherHPURL;
	}
	public String getIsFollowed() {
		return isFollowed;
	}
	public void setIsFollowed(String isFollowed) {
		this.isFollowed = isFollowed;
	}

}
