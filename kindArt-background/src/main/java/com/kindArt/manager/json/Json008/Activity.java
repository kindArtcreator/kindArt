package com.kindArt.manager.json.Json008;

public class Activity {
	private String activityId;// 动态ID
	private String activityName;// 动态名称
	private String activityURL;// 动态图片地址
	private String actUserId;// 动态发布人ID
	private String actUserPhotoURL;// 动态发布人头像地址
	private String commentNum;// 评论数
	private String likeNum;// 点赞数

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getActivityURL() {
		return activityURL;
	}

	public void setActivityURL(String activityURL) {
		this.activityURL = activityURL;
	}

	public String getActUserId() {
		return actUserId;
	}

	public void setActUserId(String actUserId) {
		this.actUserId = actUserId;
	}

	public String getActUserPhotoURL() {
		return actUserPhotoURL;
	}

	public void setActUserPhotoURL(String actUserPhotoURL) {
		this.actUserPhotoURL = actUserPhotoURL;
	}

	public String getCommentNum() {
		return commentNum;
	}

	public void setCommentNum(String commentNum) {
		this.commentNum = commentNum;
	}

	public String getLikeNum() {
		return likeNum;
	}

	public void setLikeNum(String likeNum) {
		this.likeNum = likeNum;
	}

}
