package com.kindArt.manager.service;

import com.kindArt.manager.domain.FindPublisherBase;

public interface IFindPublisherBaseService {
	
	public void insert(FindPublisherBase record);  
	
	public int deleteByPrimaryKey(String uuid);

	public int insertSelective(FindPublisherBase record);

	public FindPublisherBase selectByPrimaryKey(String uuid);

	public int updateByPrimaryKeySelective(FindPublisherBase record);

	public int updateByPrimaryKey(FindPublisherBase record);
	
}
