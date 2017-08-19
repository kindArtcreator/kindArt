package com.kindArt.manager.service;

import com.kindArt.manager.domain.UserBaseInfo;

public interface IUserBaseInfoService {
	
	public UserBaseInfo getUserById(String userId);  
	
	public void updateUserById(UserBaseInfo ubi);  
	
	public void insert(UserBaseInfo record);  
	
	public int deleteByPrimaryKey(String uuid);

	public int insertSelective(UserBaseInfo record);

	public UserBaseInfo selectByPrimaryKey(String uuid);

	public int updateByPrimaryKeySelective(UserBaseInfo record);

	public int updateByPrimaryKey(UserBaseInfo record);
}
