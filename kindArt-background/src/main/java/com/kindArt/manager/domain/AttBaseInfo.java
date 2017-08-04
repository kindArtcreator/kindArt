package com.kindArt.manager.domain;

public class AttBaseInfo {
    private String uuid;

    private String attAddress;

    private String attName;

    private String attType;

    private String attSize;

    private String attClassification;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getAttAddress() {
        return attAddress;
    }

    public void setAttAddress(String attAddress) {
        this.attAddress = attAddress == null ? null : attAddress.trim();
    }

    public String getAttName() {
        return attName;
    }

    public void setAttName(String attName) {
        this.attName = attName == null ? null : attName.trim();
    }

    public String getAttType() {
        return attType;
    }

    public void setAttType(String attType) {
        this.attType = attType == null ? null : attType.trim();
    }

    public String getAttSize() {
        return attSize;
    }

    public void setAttSize(String attSize) {
        this.attSize = attSize == null ? null : attSize.trim();
    }

    public String getAttClassification() {
        return attClassification;
    }

    public void setAttClassification(String attClassification) {
        this.attClassification = attClassification == null ? null : attClassification.trim();
    }
}