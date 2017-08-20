package com.kindArt.manager.service;

import java.util.List;

import com.kindArt.manager.domain.TagBaseInfo;

public interface ITagBaseInfoService {
	
	public void insert(TagBaseInfo record);  
	
	public int deleteByPrimaryKey(String uuid);

	public int insertSelective(TagBaseInfo record);

	public TagBaseInfo selectByPrimaryKey(String uuid);

	public int updateByPrimaryKeySelective(TagBaseInfo record);

	public int updateByPrimaryKey(TagBaseInfo record);
	
	public List<TagBaseInfo> selectList();
	
}
