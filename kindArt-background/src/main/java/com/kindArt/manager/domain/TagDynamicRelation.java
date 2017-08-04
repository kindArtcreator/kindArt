package com.kindArt.manager.domain;

public class TagDynamicRelation {
    private String uuid;

    private String activityNo;

    private String tagNo;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getActivityNo() {
        return activityNo;
    }

    public void setActivityNo(String activityNo) {
        this.activityNo = activityNo == null ? null : activityNo.trim();
    }

    public String getTagNo() {
        return tagNo;
    }

    public void setTagNo(String tagNo) {
        this.tagNo = tagNo == null ? null : tagNo.trim();
    }
}