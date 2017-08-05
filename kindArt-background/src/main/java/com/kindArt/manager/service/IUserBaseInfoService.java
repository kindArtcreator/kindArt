package com.kindArt.manager.service;

import com.kindArt.manager.domain.UserBaseInfo;

public interface IUserBaseInfoService {
	
	public UserBaseInfo getUserById(String userId);  
	
	public void updateUserById(UserBaseInfo ubi);  
}
