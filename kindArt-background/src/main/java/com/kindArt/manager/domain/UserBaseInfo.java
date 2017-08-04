package com.kindArt.manager.domain;

import java.util.Date;

public class UserBaseInfo {
    private String userNo;

    private String headSculpture;

    private String myNickname;

    private String myPhone;

    private Integer commendedNum;

    private Integer fansNum;

    private Integer followNum;

    private String myTag;

    private String myPosition;

    private String sex;

    private String birthday;

    private String myAddress;

    private String signature;

    private Integer sharedNum;

    private Integer shareNum;

    private String wechatNum;

    private String qqNum;

    private String blogNum;

    private Date registerTime;

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo == null ? null : userNo.trim();
    }

    public String getHeadSculpture() {
        return headSculpture;
    }

    public void setHeadSculpture(String headSculpture) {
        this.headSculpture = headSculpture == null ? null : headSculpture.trim();
    }

    public String getMyNickname() {
        return myNickname;
    }

    public void setMyNickname(String myNickname) {
        this.myNickname = myNickname == null ? null : myNickname.trim();
    }

    public String getMyPhone() {
        return myPhone;
    }

    public void setMyPhone(String myPhone) {
        this.myPhone = myPhone == null ? null : myPhone.trim();
    }

    public Integer getCommendedNum() {
        return commendedNum;
    }

    public void setCommendedNum(Integer commendedNum) {
        this.commendedNum = commendedNum;
    }

    public Integer getFansNum() {
        return fansNum;
    }

    public void setFansNum(Integer fansNum) {
        this.fansNum = fansNum;
    }

    public Integer getFollowNum() {
        return followNum;
    }

    public void setFollowNum(Integer followNum) {
        this.followNum = followNum;
    }

    public String getMyTag() {
        return myTag;
    }

    public void setMyTag(String myTag) {
        this.myTag = myTag == null ? null : myTag.trim();
    }

    public String getMyPosition() {
        return myPosition;
    }

    public void setMyPosition(String myPosition) {
        this.myPosition = myPosition == null ? null : myPosition.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getMyAddress() {
        return myAddress;
    }

    public void setMyAddress(String myAddress) {
        this.myAddress = myAddress == null ? null : myAddress.trim();
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }

    public Integer getSharedNum() {
        return sharedNum;
    }

    public void setSharedNum(Integer sharedNum) {
        this.sharedNum = sharedNum;
    }

    public Integer getShareNum() {
        return shareNum;
    }

    public void setShareNum(Integer shareNum) {
        this.shareNum = shareNum;
    }

    public String getWechatNum() {
        return wechatNum;
    }

    public void setWechatNum(String wechatNum) {
        this.wechatNum = wechatNum == null ? null : wechatNum.trim();
    }

    public String getQqNum() {
        return qqNum;
    }

    public void setQqNum(String qqNum) {
        this.qqNum = qqNum == null ? null : qqNum.trim();
    }

    public String getBlogNum() {
        return blogNum;
    }

    public void setBlogNum(String blogNum) {
        this.blogNum = blogNum == null ? null : blogNum.trim();
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }
}