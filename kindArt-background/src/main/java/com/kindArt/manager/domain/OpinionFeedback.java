package com.kindArt.manager.domain;

import java.util.Date;

public class OpinionFeedback {
    private String uuid;

    private String opinionType;

    private String opinionCode;

    private String opinionCodeComment;

    private String opinionComment;

    private String attUuid;

    private String feedbackNo;

    private Date feedbackTime;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getOpinionType() {
        return opinionType;
    }

    public void setOpinionType(String opinionType) {
        this.opinionType = opinionType == null ? null : opinionType.trim();
    }

    public String getOpinionCode() {
        return opinionCode;
    }

    public void setOpinionCode(String opinionCode) {
        this.opinionCode = opinionCode == null ? null : opinionCode.trim();
    }

    public String getOpinionCodeComment() {
        return opinionCodeComment;
    }

    public void setOpinionCodeComment(String opinionCodeComment) {
        this.opinionCodeComment = opinionCodeComment == null ? null : opinionCodeComment.trim();
    }

    public String getOpinionComment() {
        return opinionComment;
    }

    public void setOpinionComment(String opinionComment) {
        this.opinionComment = opinionComment == null ? null : opinionComment.trim();
    }

    public String getAttUuid() {
        return attUuid;
    }

    public void setAttUuid(String attUuid) {
        this.attUuid = attUuid == null ? null : attUuid.trim();
    }

    public String getFeedbackNo() {
        return feedbackNo;
    }

    public void setFeedbackNo(String feedbackNo) {
        this.feedbackNo = feedbackNo == null ? null : feedbackNo.trim();
    }

    public Date getFeedbackTime() {
        return feedbackTime;
    }

    public void setFeedbackTime(Date feedbackTime) {
        this.feedbackTime = feedbackTime;
    }
}