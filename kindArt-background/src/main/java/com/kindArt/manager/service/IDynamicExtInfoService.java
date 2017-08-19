package com.kindArt.manager.service;

import com.kindArt.manager.domain.DynamicExtInfo;

public interface IDynamicExtInfoService {
	
	public void insert(DynamicExtInfo record);  
	
	public int deleteByPrimaryKey(String uuid);

	public int insertSelective(DynamicExtInfo record);

	public DynamicExtInfo selectByPrimaryKey(String uuid);

	public int updateByPrimaryKeySelective(DynamicExtInfo record);

	public int updateByPrimaryKey(DynamicExtInfo record);
	
}
