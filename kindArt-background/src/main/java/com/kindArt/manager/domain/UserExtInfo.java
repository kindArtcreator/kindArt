package com.kindArt.manager.domain;

public class UserExtInfo {
    private String uuid;

    private String userNo;

    private String type;

    private String relatedUserNo;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo == null ? null : userNo.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getRelatedUserNo() {
        return relatedUserNo;
    }

    public void setRelatedUserNo(String relatedUserNo) {
        this.relatedUserNo = relatedUserNo == null ? null : relatedUserNo.trim();
    }
}