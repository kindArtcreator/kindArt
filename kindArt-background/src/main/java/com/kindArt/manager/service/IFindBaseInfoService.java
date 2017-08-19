package com.kindArt.manager.service;

import com.kindArt.manager.domain.FindBaseInfo;

public interface IFindBaseInfoService {
	
	public void insert(FindBaseInfo record);  
	
	public int deleteByPrimaryKey(String uuid);

	public int insertSelective(FindBaseInfo record);

	public FindBaseInfo selectByPrimaryKey(String uuid);

	public int updateByPrimaryKeySelective(FindBaseInfo record);

	public int updateByPrimaryKey(FindBaseInfo record);
	
}
