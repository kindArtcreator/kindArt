package com.kindArt.manager.json.Json011;

import java.util.List;

public class Json011Req {

	private String messageId;// 消息ID
	private String operateMode;// 操作方式
	private ActivityObj activityObj;// 动态内容
	private List<ActivityImg> activityImgs;// 社区动态图片

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getOperateMode() {
		return operateMode;
	}

	public void setOperateMode(String operateMode) {
		this.operateMode = operateMode;
	}

	public ActivityObj getActivityObj() {
		return activityObj;
	}

	public void setActivityObj(ActivityObj activityObj) {
		this.activityObj = activityObj;
	}

	public List<ActivityImg> getActivityImgs() {
		return activityImgs;
	}

	public void setActivityImgs(List<ActivityImg> activityImgs) {
		this.activityImgs = activityImgs;
	}

}
