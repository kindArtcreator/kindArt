package com.kindArt.manager.json.Json018;

import java.util.List;

public class Json018Res {

	public Json018Res() {

	}

	private ReturnObj returnObj;// 返回结果区域
	private PublisherInfo publisherInfo;// 返回结果区域
	private TopicInfo topicInfo;// 返回结果区域
	private List<TopicImgInfo> topicImgInfoList;// 返回结果区域
	private List<Comment> comments;// 返回结果区域
	
	public ReturnObj getReturnObj() {
		return returnObj;
	}
	public void setReturnObj(ReturnObj returnObj) {
		this.returnObj = returnObj;
	}
	public PublisherInfo getPublisherInfo() {
		return publisherInfo;
	}
	public void setPublisherInfo(PublisherInfo publisherInfo) {
		this.publisherInfo = publisherInfo;
	}
	public TopicInfo getTopicInfo() {
		return topicInfo;
	}
	public void setTopicInfo(TopicInfo topicInfo) {
		this.topicInfo = topicInfo;
	}
	public List<TopicImgInfo> getTopicImgInfoList() {
		return topicImgInfoList;
	}
	public void setTopicImgInfoList(List<TopicImgInfo> topicImgInfoList) {
		this.topicImgInfoList = topicImgInfoList;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	
	

}
