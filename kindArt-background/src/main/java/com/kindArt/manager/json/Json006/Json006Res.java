package com.kindArt.manager.json.Json006;

import java.util.List;


public class Json006Res {

	private ReturnObj returnObj;// 返回结果区域
	
	private List<Tag> tags;//标签

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public Json006Res() {

	}

	public ReturnObj getReturnObj() {
		return returnObj;
	}

	public void setReturnObj(ReturnObj returnObj) {
		this.returnObj = returnObj;
	}

}
