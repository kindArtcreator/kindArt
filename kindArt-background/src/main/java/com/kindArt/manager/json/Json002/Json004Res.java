package com.kindArt.manager.json.Json002;

import java.util.List;

public class Json004Res {

	private ReturnObj returnObj;

	private List<ActivityImg> activityImgs;

	private List<ActivityObj> activityObjs;

	public List<ActivityImg> getActivityImgs() {
		return activityImgs;
	}

	public void setActivityImgs(List<ActivityImg> activityImgs) {
		this.activityImgs = activityImgs;
	}

	public List<ActivityObj> getActivityObjs() {
		return activityObjs;
	}

	public void setActivityObjs(List<ActivityObj> activityObjs) {
		this.activityObjs = activityObjs;
	}

	public List<CommentAnswer> getCommentAnswers() {
		return commentAnswers;
	}

	public void setCommentAnswers(List<CommentAnswer> commentAnswers) {
		this.commentAnswers = commentAnswers;
	}

	private List<CommentAnswer> commentAnswers;

	public ReturnObj getReturnObj() {
		return returnObj;
	}

	public void setReturnObj(ReturnObj returnObj) {
		this.returnObj = returnObj;
	}

}
