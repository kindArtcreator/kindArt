package com.kindArt.manager.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kindArt.manager.dao.UserBaseInfoMapper;
import com.kindArt.manager.domain.UserBaseInfo;
import com.kindArt.manager.service.IUserBaseInfoService;

@Service("UserBaseInfoService") 
public class UserBaseInfoServiceImpl implements IUserBaseInfoService {

	@Resource  
    private UserBaseInfoMapper UserBaseInfoDao;  

	@Override
	public void insert(UserBaseInfo record) {

		this.UserBaseInfoDao.insert(record);

	}

	@Override
	public int deleteByPrimaryKey(String uuid) {
		
		return this.UserBaseInfoDao.deleteByPrimaryKey(uuid);
	}

	@Override
	public int insertSelective(UserBaseInfo record) {
		
		return this.UserBaseInfoDao.insertSelective(record);
	}

	@Override
	public UserBaseInfo selectByPrimaryKey(String uuid) {
		
		return this.UserBaseInfoDao.selectByPrimaryKey(uuid);
	}

	@Override
	public int updateByPrimaryKeySelective(UserBaseInfo record) {
		
		return this.UserBaseInfoDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(UserBaseInfo record) {
		
		return this.UserBaseInfoDao.updateByPrimaryKey(record);
	}

	@Override
	public UserBaseInfo getUserById(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUserById(UserBaseInfo ubi) {
		// TODO Auto-generated method stub
		
	}

}
