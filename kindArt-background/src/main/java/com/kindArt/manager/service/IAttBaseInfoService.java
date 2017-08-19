package com.kindArt.manager.service;

import com.kindArt.manager.domain.AttBaseInfo;

public interface IAttBaseInfoService {
	
	public void insert(AttBaseInfo record);  
	
	public int deleteByPrimaryKey(String uuid);

	public int insertSelective(AttBaseInfo record);

	public AttBaseInfo selectByPrimaryKey(String uuid);

	public int updateByPrimaryKeySelective(AttBaseInfo record);

	public int updateByPrimaryKey(AttBaseInfo record);
	
}
