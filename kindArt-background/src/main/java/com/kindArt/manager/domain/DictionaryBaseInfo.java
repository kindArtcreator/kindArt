package com.kindArt.manager.domain;

public class DictionaryBaseInfo {
    private String uuid;

    private String dictTypeCode;

    private String dictTypeName;

    private String dictCode;

    private String dictValue;

    private String dictParentUuid;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getDictTypeCode() {
        return dictTypeCode;
    }

    public void setDictTypeCode(String dictTypeCode) {
        this.dictTypeCode = dictTypeCode == null ? null : dictTypeCode.trim();
    }

    public String getDictTypeName() {
        return dictTypeName;
    }

    public void setDictTypeName(String dictTypeName) {
        this.dictTypeName = dictTypeName == null ? null : dictTypeName.trim();
    }

    public String getDictCode() {
        return dictCode;
    }

    public void setDictCode(String dictCode) {
        this.dictCode = dictCode == null ? null : dictCode.trim();
    }

    public String getDictValue() {
        return dictValue;
    }

    public void setDictValue(String dictValue) {
        this.dictValue = dictValue == null ? null : dictValue.trim();
    }

    public String getDictParentUuid() {
        return dictParentUuid;
    }

    public void setDictParentUuid(String dictParentUuid) {
        this.dictParentUuid = dictParentUuid == null ? null : dictParentUuid.trim();
    }
}