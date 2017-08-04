package com.kindArt.manager.domain;

import java.util.Date;

public class FindBaseInfo {
    private String uuid;

    private String publisherNo;

    private Date publisherTime;

    private String activityTitle;

    private Integer commendedNum;

    private Integer collectionNum;

    private Integer followNum;

    private Integer shareNum;

    private String province;

    private String city;

    private String area;

    private String village;

    private String publishAddress;

    private byte[] activityContent;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
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

    public String getActivityTitle() {
        return activityTitle;
    }

    public void setActivityTitle(String activityTitle) {
        this.activityTitle = activityTitle == null ? null : activityTitle.trim();
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

    public Integer getFollowNum() {
        return followNum;
    }

    public void setFollowNum(Integer followNum) {
        this.followNum = followNum;
    }

    public Integer getShareNum() {
        return shareNum;
    }

    public void setShareNum(Integer shareNum) {
        this.shareNum = shareNum;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village == null ? null : village.trim();
    }

    public String getPublishAddress() {
        return publishAddress;
    }

    public void setPublishAddress(String publishAddress) {
        this.publishAddress = publishAddress == null ? null : publishAddress.trim();
    }

    public byte[] getActivityContent() {
        return activityContent;
    }

    public void setActivityContent(byte[] activityContent) {
        this.activityContent = activityContent;
    }
}