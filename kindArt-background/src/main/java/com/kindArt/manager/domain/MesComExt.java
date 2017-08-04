package com.kindArt.manager.domain;

public class MesComExt {
    private String uuid;

    private String messageUuid;

    private String relatedUuid;

    private String relatedType;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getMessageUuid() {
        return messageUuid;
    }

    public void setMessageUuid(String messageUuid) {
        this.messageUuid = messageUuid == null ? null : messageUuid.trim();
    }

    public String getRelatedUuid() {
        return relatedUuid;
    }

    public void setRelatedUuid(String relatedUuid) {
        this.relatedUuid = relatedUuid == null ? null : relatedUuid.trim();
    }

    public String getRelatedType() {
        return relatedType;
    }

    public void setRelatedType(String relatedType) {
        this.relatedType = relatedType == null ? null : relatedType.trim();
    }
}