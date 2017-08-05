package com.kindArt.manager.json.Json004;

import java.util.List;

public class Json004Req {
	
	private List<ActivityImg> activityImgs;
	
	private ActivityObj activityObj;
	
	private List<Tag> tags;

	public List<ActivityImg> getActivityImgs() {
		return activityImgs;
	}

	public void setActivityImgs(List<ActivityImg> activityImgs) {
		this.activityImgs = activityImgs;
	}

	public ActivityObj getActivityObj() {
		return activityObj;
	}

	public void setActivityObj(ActivityObj activityObj) {
		this.activityObj = activityObj;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}




}
