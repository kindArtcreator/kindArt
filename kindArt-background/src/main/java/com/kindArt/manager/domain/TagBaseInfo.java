package com.kindArt.manager.domain;

public class TagBaseInfo {
    private String tagNo;

    private String tagName;

    private String tagTypeNo;

    private String tagTypeName;

    public String getTagNo() {
        return tagNo;
    }

    public void setTagNo(String tagNo) {
        this.tagNo = tagNo == null ? null : tagNo.trim();
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName == null ? null : tagName.trim();
    }

    public String getTagTypeNo() {
        return tagTypeNo;
    }

    public void setTagTypeNo(String tagTypeNo) {
        this.tagTypeNo = tagTypeNo == null ? null : tagTypeNo.trim();
    }

    public String getTagTypeName() {
        return tagTypeName;
    }

    public void setTagTypeName(String tagTypeName) {
        this.tagTypeName = tagTypeName == null ? null : tagTypeName.trim();
    }
}