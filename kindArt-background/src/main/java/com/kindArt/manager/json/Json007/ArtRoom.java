package com.kindArt.manager.json.Json007;

public class ArtRoom {
	private String roomName;// 名称
	private String roomURL;// 图片地址
	private String tags;// 标签合集
	private String abstractInfo;// 简介

	public String getAbstractInfo() {
		return abstractInfo;
	}

	public void setAbstractInfo(String abstractInfo) {
		this.abstractInfo = abstractInfo;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public String getRoomURL() {
		return roomURL;
	}

	public void setRoomURL(String roomURL) {
		this.roomURL = roomURL;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}// 标签合集

}
