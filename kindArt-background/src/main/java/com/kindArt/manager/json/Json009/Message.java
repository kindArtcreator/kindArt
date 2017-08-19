package com.kindArt.manager.json.Json009;

public class Message {
	
	private String messageId ;//消息人ID
	private String messageName ;//消息人名称
	private String messageTitle ;//消息标题
	private String message ;//消息发布时间
	private String messageType ;//消息类型
	private String messageHPURL ;//消息人头像地址
	public String getMessageId() {
		return messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	public String getMessageName() {
		return messageName;
	}
	public void setMessageName(String messageName) {
		this.messageName = messageName;
	}
	public String getMessageTitle() {
		return messageTitle;
	}
	public void setMessageTitle(String messageTitle) {
		this.messageTitle = messageTitle;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
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
