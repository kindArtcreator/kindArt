package com.kindArt.manager.json.Json013;

public class Liked {
	private String likedId;// 点赞人ID
	private String likedName;// 点赞人名称
	private String likedTime;// 点赞时间
	private String likedHPURL;// 点赞人头像地址
	private String thumbnailLikedURL;// 被赞作品缩略图地址

	public String getLikedId() {
		return likedId;
	}

	public void setLikedId(String likedId) {
		this.likedId = likedId;
	}

	public String getLikedName() {
		return likedName;
	}

	public void setLikedName(String likedName) {
		this.likedName = likedName;
	}

	public String getLikedTime() {
		return likedTime;
	}

	public void setLikedTime(String likedTime) {
		this.likedTime = likedTime;
	}

	public String getLikedHPURL() {
		return likedHPURL;
	}

	public void setLikedHPURL(String likedHPURL) {
		this.likedHPURL = likedHPURL;
	}

	public String getThumbnailLikedURL() {
		return thumbnailLikedURL;
	}

	public void setThumbnailLikedURL(String thumbnailLikedURL) {
		this.thumbnailLikedURL = thumbnailLikedURL;
	}

}
