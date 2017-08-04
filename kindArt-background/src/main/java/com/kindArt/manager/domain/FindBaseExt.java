package com.kindArt.manager.domain;

public class FindBaseExt {
    private String uuid;

    private String activityNo;

    private String type;

    private String relationUserId;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getRelationUserId() {
        return relationUserId;
    }

    public void setRelationUserId(String relationUserId) {
        this.relationUserId = relationUserId == null ? null : relationUserId.trim();
    }
}