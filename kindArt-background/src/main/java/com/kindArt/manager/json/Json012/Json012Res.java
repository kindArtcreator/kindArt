package com.kindArt.manager.json.Json012;

import java.util.List;


public class Json012Res {

	private ReturnObj returnObj;// 返回结果区域
	private UserInfo userInfo;// 用户信息
	private List<MyActObj> myActObjs;// 我发布的作品
	private List<MyLikedActObj> myLikedActObjs;//我赞过的作品

	public Json012Res() {

	}

	public ReturnObj getReturnObj() {
		return returnObj;
	}

	public void setReturnObj(ReturnObj returnObj) {
		this.returnObj = returnObj;
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public List<MyActObj> getMyActObjs() {
		return myActObjs;
	}

	public void setMyActObjs(List<MyActObj> myActObjs) {
		this.myActObjs = myActObjs;
	}

	public List<MyLikedActObj> getMyLikedActObjs() {
		return myLikedActObjs;
	}

	public void setMyLikedActObjs(List<MyLikedActObj> myLikedActObjs) {
		this.myLikedActObjs = myLikedActObjs;
	}


}
