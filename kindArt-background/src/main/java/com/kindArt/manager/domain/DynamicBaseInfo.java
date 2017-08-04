package com.kindArt.manager.domain;

import java.util.Date;

public class DynamicBaseInfo {
    private String uuid;

    private String title;

    private String comment;

    private Integer commendedNum;

    private Integer collectionNum;

    private String publisherNo;

    private Date publisherTime;

    private String dynamicStatus;

    private Integer sharedNum;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public Integer getCommendedNum() {
        return commendedNum;
    }

    public void setCommendedNum(Integer commendedNum) {
        this.commendedNum = commendedNum;
    }

    public Integer getCollectionNum() {
        return collectionNum;
    }

    public void setCollectionNum(Integer collectionNum) {
        this.collectionNum = collectionNum;
    }

    public String getPublisherNo() {
        return publisherNo;
    }

    public void setPublisherNo(String publisherNo) {
        this.publisherNo = publisherNo == null ? null : publisherNo.trim();
    }

    public Date getPublisherTime() {
        return publisherTime;
    }

    public void setPublisherTime(Date publisherTime) {
        this.publisherTime = publisherTime;
    }

    public String getDynamicStatus() {
        return dynamicStatus;
    }

    public void setDynamicStatus(String dynamicStatus) {
        this.dynamicStatus = dynamicStatus == null ? null : dynamicStatus.trim();
    }

    public Integer getSharedNum() {
        return sharedNum;
    }

    public void setSharedNum(Integer sharedNum) {
        this.sharedNum = sharedNum;
    }
}