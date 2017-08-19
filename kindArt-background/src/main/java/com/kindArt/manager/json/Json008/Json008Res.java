package com.kindArt.manager.json.Json008;

import java.util.List;

public class Json008Res {

	private ReturnObj returnObj;// 返回结果区域
	private ArtRoomObj artRoomObj;// 动态区
	private ActivityInfo activityInfo;// 活动信息
	private List<Comment> comments;//评论
	
	
	public ReturnObj getReturnObj() {
		return returnObj;
	}


	public void setReturnObj(ReturnObj returnObj) {
		this.returnObj = returnObj;
	}


	public ArtRoomObj getArtRoomObj() {
		return artRoomObj;
	}


	public void setArtRoomObj(ArtRoomObj artRoomObj) {
		this.artRoomObj = artRoomObj;
	}


	public ActivityInfo getActivityInfo() {
		return activityInfo;
	}


	public void setActivityInfo(ActivityInfo activityInfo) {
		this.activityInfo = activityInfo;
	}


	public List<Comment> getComments() {
		return comments;
	}


	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}


	public Json008Res() {

	}

	
}
