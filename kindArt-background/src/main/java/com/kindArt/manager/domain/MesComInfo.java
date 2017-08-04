package com.kindArt.manager.domain;

import java.util.Date;

public class MesComInfo {
    private String uuid;

    private String messageParentNo;

    private String messageComment;

    private String messagePublisherNo;

    private Date messagePublisherTime;

    private String messageWay;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getMessageParentNo() {
        return messageParentNo;
    }

    public void setMessageParentNo(String messageParentNo) {
        this.messageParentNo = messageParentNo == null ? null : messageParentNo.trim();
    }

    public String getMessageComment() {
        return messageComment;
    }

    public void setMessageComment(String messageComment) {
        this.messageComment = messageComment == null ? null : messageComment.trim();
    }

    public String getMessagePublisherNo() {
        return messagePublisherNo;
    }

    public void setMessagePublisherNo(String messagePublisherNo) {
        this.messagePublisherNo = messagePublisherNo == null ? null : messagePublisherNo.trim();
    }

    public Date getMessagePublisherTime() {
        return messagePublisherTime;
    }

    public void setMessagePublisherTime(Date messagePublisherTime) {
        this.messagePublisherTime = messagePublisherTime;
    }

    public String getMessageWay() {
        return messageWay;
    }

    public void setMessageWay(String messageWay) {
        this.messageWay = messageWay == null ? null : messageWay.trim();
    }
}