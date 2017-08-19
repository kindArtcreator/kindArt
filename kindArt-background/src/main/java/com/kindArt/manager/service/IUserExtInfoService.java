package com.kindArt.manager.service;

import com.kindArt.manager.domain.UserExtInfo;

public interface IUserExtInfoService {
	
	public void insert(UserExtInfo record);  
	
	public int deleteByPrimaryKey(String uuid);

	public int insertSelective(UserExtInfo record);

	public UserExtInfo selectByPrimaryKey(String uuid);

	public int updateByPrimaryKeySelective(UserExtInfo record);

	public int updateByPrimaryKey(UserExtInfo record);
	
}
