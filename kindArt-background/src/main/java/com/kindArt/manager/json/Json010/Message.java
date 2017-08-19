package com.kindArt.manager.json.Json010;

public class Message {

	private String messagePerId;// 消息人ID
	private String messagePerName;// 消息人名称
	private String messageTitle;// 消息标题
	private String messagePublishTime;// 消息发布时间
	private String messageType;// 消息类型
	private String messageHPURL;// 消息人头像地址
	private String messageContent;// 消息内容

	public String getMessagePerId() {
		return messagePerId;
	}

	public void setMessagePerId(String messagePerId) {
		this.messagePerId = messagePerId;
	}

	public String getMessagePerName() {
		return messagePerName;
	}

	public void setMessagePerName(String messagePerName) {
		this.messagePerName = messagePerName;
	}

	public String getMessagePublishTime() {
		return messagePublishTime;
	}

	public void setMessagePublishTime(String messagePublishTime) {
		this.messagePublishTime = messagePublishTime;
	}

	public String getMessageContent() {
		return messageContent;
	}

	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}

	public String getMessageTitle() {
		return messageTitle;
	}

	public void setMessageTitle(String messageTitle) {
		this.messageTitle = messageTitle;
	}

	public String getMessageType() {
		return messageType;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	public String getMessageHPURL() {
		return messageHPURL;
	}

	public void setMessageHPURL(String messageHPURL) {
		this.messageHPURL = messageHPURL;
	}

}
