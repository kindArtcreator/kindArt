package com.kindArt.manager.json.Json005;

import java.util.List;

public class Json005Req {

	private String type;// 类型
	private String tagId;// 标签ID
	private String reportContent;// 举报内容
	private String userId;// 举报人id

	private List<ReportImg> reportImg;

	public List<ReportImg> getReportImg() {
		return reportImg;
	}

	public void setReportImg(List<ReportImg> reportImg) {
		this.reportImg = reportImg;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTagId() {
		return tagId;
	}

	public void setTagId(String tagId) {
		this.tagId = tagId;
	}

	public String getReportContent() {
		return reportContent;
	}

	public void setReportContent(String reportContent) {
		this.reportContent = reportContent;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
