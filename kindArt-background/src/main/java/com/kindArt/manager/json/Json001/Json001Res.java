package com.kindArt.manager.json.Json001;

import java.util.List;

public class Json001Res {

	private ReturnObj returnObj;// 返回结果区域

	private List<ActivityObj> activityObjs;// 社区动态列表

	public Json001Res() {

	}

	public ReturnObj getReturnObj() {
		return returnObj;
	}

	public void setReturnObj(ReturnObj returnObj) {
		this.returnObj = returnObj;
	}

	public List<ActivityObj> getActivityObjs() {
		return activityObjs;
	}

	public void setActivityObjs(List<ActivityObj> activityObjs) {
		this.activityObjs = activityObjs;
	}

}
