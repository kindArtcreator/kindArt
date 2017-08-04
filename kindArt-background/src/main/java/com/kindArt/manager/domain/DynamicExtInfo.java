package com.kindArt.manager.domain;

public class DynamicExtInfo {
    private String uuid;

    private String dynamicNo;

    private String type;

    private String relatedUserId;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getDynamicNo() {
        return dynamicNo;
    }

    public void setDynamicNo(String dynamicNo) {
        this.dynamicNo = dynamicNo == null ? null : dynamicNo.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getRelatedUserId() {
        return relatedUserId;
    }

    public void setRelatedUserId(String relatedUserId) {
        this.relatedUserId = relatedUserId == null ? null : relatedUserId.trim();
    }
}