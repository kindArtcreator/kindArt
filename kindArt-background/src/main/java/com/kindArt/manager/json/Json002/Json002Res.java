package com.kindArt.manager.json.Json002;

import java.util.List;

public class Json002Res {

	private ReturnObj returnObj;

	private List<ActivityImg> activityImgs;

	private ActivityObj activityObj;

	public List<ActivityImg> getActivityImgs() {
		return activityImgs;
	}

	public void setActivityImgs(List<ActivityImg> activityImgs) {
		this.activityImgs = activityImgs;
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

	public ActivityObj getActivityObj() {
		return activityObj;
	}

	public void setActivityObj(ActivityObj activityObj) {
		this.activityObj = activityObj;
	}

}
