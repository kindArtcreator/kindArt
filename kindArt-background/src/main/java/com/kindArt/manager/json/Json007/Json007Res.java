package com.kindArt.manager.json.Json007;

import java.util.List;

public class Json007Res {

	private ReturnObj returnObj;// 返回结果区域
	private List<Activity> activities;// 动态区
	private List<HotTopic> hotTopics;// 热门话题

	public List<Activity> getActivities() {
		return activities;
	}

	public void setActivities(List<Activity> activities) {
		this.activities = activities;
	}

	public List<HotTopic> getHotTopics() {
		return hotTopics;
	}

	public void setHotTopics(List<HotTopic> hotTopics) {
		this.hotTopics = hotTopics;
	}

	public List<ArtRoom> getArtRooms() {
		return artRooms;
	}

	public void setArtRooms(List<ArtRoom> artRooms) {
		this.artRooms = artRooms;
	}

	private List<ArtRoom> artRooms;// 画室黄历

	public Json007Res() {

	}

	public ReturnObj getReturnObj() {
		return returnObj;
	}

	public void setReturnObj(ReturnObj returnObj) {
		this.returnObj = returnObj;
	}

}
