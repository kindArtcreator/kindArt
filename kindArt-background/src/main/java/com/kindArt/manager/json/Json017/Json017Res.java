package com.kindArt.manager.json.Json017;

import java.util.List;

public class Json017Res {

	public Json017Res() {

	}

	private ReturnObj returnObj;// 返回结果区域
	private List<Comment> comments;// 热门话题列表

	public ReturnObj getReturnObj() {
		return returnObj;
	}

	public void setReturnObj(ReturnObj returnObj) {
		this.returnObj = returnObj;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

}
