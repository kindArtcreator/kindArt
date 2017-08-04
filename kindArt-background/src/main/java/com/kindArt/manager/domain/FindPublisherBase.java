package com.kindArt.manager.domain;

import java.util.Date;

public class FindPublisherBase {
    private String uuid;

    private String subjectPhotoNo;

    private String logoPhotoNo;

    private String publishingEnterpriseName;

    private String publishingEnterpriseSumary;

    private Date maintenanceTime;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getSubjectPhotoNo() {
        return subjectPhotoNo;
    }

    public void setSubjectPhotoNo(String subjectPhotoNo) {
        this.subjectPhotoNo = subjectPhotoNo == null ? null : subjectPhotoNo.trim();
    }

    public String getLogoPhotoNo() {
        return logoPhotoNo;
    }

    public void setLogoPhotoNo(String logoPhotoNo) {
        this.logoPhotoNo = logoPhotoNo == null ? null : logoPhotoNo.trim();
    }

    public String getPublishingEnterpriseName() {
        return publishingEnterpriseName;
    }

    public void setPublishingEnterpriseName(String publishingEnterpriseName) {
        this.publishingEnterpriseName = publishingEnterpriseName == null ? null : publishingEnterpriseName.trim();
    }

    public String getPublishingEnterpriseSumary() {
        return publishingEnterpriseSumary;
    }

    public void setPublishingEnterpriseSumary(String publishingEnterpriseSumary) {
        this.publishingEnterpriseSumary = publishingEnterpriseSumary == null ? null : publishingEnterpriseSumary.trim();
    }

    public Date getMaintenanceTime() {
        return maintenanceTime;
    }

    public void setMaintenanceTime(Date maintenanceTime) {
        this.maintenanceTime = maintenanceTime;
    }
}