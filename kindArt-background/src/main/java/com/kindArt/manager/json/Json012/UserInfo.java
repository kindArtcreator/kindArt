package com.kindArt.manager.json.Json012;

public class UserInfo {
	
	private String userName;// 用户昵称
	private String userId;// 用户ID
	private String likedNum;// 被赞数
	private String commentNum;// 评论数
	private String fansNum;// 粉丝数
	private String address;// 地理位置
	private String tags;// 标签名称

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getLikedNum() {
		return likedNum;
	}

	public void setLikedNum(String likedNum) {
		this.likedNum = likedNum;
	}

	public String getCommentNum() {
		return commentNum;
	}

	public void setCommentNum(String commentNum) {
		this.commentNum = commentNum;
	}

	public String getFansNum() {
		return fansNum;
	}

	public void setFansNum(String fansNum) {
		this.fansNum = fansNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

}
