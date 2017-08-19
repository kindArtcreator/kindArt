package com.kindArt.manager.json.Json002;

public class ActivityObj {
	private String title;// 标题
	private String content;// 内容
	private String likedNum;// 点赞数
	private String collectionNum;// 收藏数
	private String commentNum;// 评论数
	private String publisherId;// 发布人ID
	private String publisherName;// 发布人昵称
	private String publisherURL;// 发布人头像地址
	private String isFollow;// 是否已关注发布人

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getLikedNum() {
		return likedNum;
	}

	public void setLikedNum(String likedNum) {
		this.likedNum = likedNum;
	}

	public String getCollectionNum() {
		return collectionNum;
	}

	public void setCollectionNum(String collectionNum) {
		this.collectionNum = collectionNum;
	}

	public String getCommentNum() {
		return commentNum;
	}

	public void setCommentNum(String commentNum) {
		this.commentNum = commentNum;
	}

	public String getPublisherId() {
		return publisherId;
	}

	public void setPublisherId(String publisherId) {
		this.publisherId = publisherId;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	public String getPublisherURL() {
		return publisherURL;
	}

	public void setPublisherURL(String publisherURL) {
		this.publisherURL = publisherURL;
	}

	public String getIsFollow() {
		return isFollow;
	}

	public void setIsFollow(String isFollow) {
		this.isFollow = isFollow;
	}

}
