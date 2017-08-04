package com.kindArt.manager.domain;

public class BusAttInfo {
    private String uuid;

    private String attId;

    private String relationId;

    private String type;

    private Integer attSeq;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getAttId() {
        return attId;
    }

    public void setAttId(String attId) {
        this.attId = attId == null ? null : attId.trim();
    }

    public String getRelationId() {
        return relationId;
    }

    public void setRelationId(String relationId) {
        this.relationId = relationId == null ? null : relationId.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getAttSeq() {
        return attSeq;
    }

    public void setAttSeq(Integer attSeq) {
        this.attSeq = attSeq;
    }
}