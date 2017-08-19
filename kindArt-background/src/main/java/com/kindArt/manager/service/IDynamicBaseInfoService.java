package com.kindArt.manager.service;

import java.util.Map;

import com.kindArt.manager.domain.DynamicBaseInfo;

public interface IDynamicBaseInfoService {
	
	public void insert(DynamicBaseInfo record);  
	
	public int deleteByPrimaryKey(String uuid);

	public int insertSelective(DynamicBaseInfo record);

	public DynamicBaseInfo selectByPrimaryKey(String uuid);

	public Map[] selectList(String userid);

	public int updateByPrimaryKeySelective(DynamicBaseInfo record);

	public int updateByPrimaryKey(DynamicBaseInfo record);
	
}
