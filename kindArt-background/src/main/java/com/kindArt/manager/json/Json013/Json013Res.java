package com.kindArt.manager.json.Json013;

import java.util.List;


public class Json013Res {

	private ReturnObj returnObj;// 返回结果区域
	
	private List<Liked> likedList;// 返回结果区域

	public Json013Res() {

	}

	public ReturnObj getReturnObj() {
		return returnObj;
	}

	public void setReturnObj(ReturnObj returnObj) {
		this.returnObj = returnObj;
	}

	public List<Liked> getLikedList() {
		return likedList;
	}

	public void setLikedList(List<Liked> likedList) {
		this.likedList = likedList;
	}


}
