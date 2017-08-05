package com.kindArt.manager.service.impl;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kindArt.manager.dao.UserBaseInfoMapper;
import com.kindArt.manager.domain.UserBaseInfo;
import com.kindArt.manager.service.IUserBaseInfoService;

@Service("userBaseInfoService")  
public class UserBaseInfroServiceImpl implements IUserBaseInfoService {
	
	@Resource  
    private UserBaseInfoMapper userBaseInfoDao;  

	@Override
	public UserBaseInfo getUserById(String userId) {
		
		return this.userBaseInfoDao.selectByPrimaryKey(userId);
	}

	@Override
	public void updateUserById(UserBaseInfo ubi) {

		this.userBaseInfoDao.updateByPrimaryKey(ubi);
		
	}


}
