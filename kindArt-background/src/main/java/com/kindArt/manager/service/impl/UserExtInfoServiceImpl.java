package com.kindArt.manager.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kindArt.manager.dao.UserExtInfoMapper;
import com.kindArt.manager.domain.UserExtInfo;
import com.kindArt.manager.service.IUserExtInfoService;

@Service("UserExtInfoService") 
public class UserExtInfoServiceImpl implements IUserExtInfoService {

	@Resource  
    private UserExtInfoMapper userExtInfoDao;  

	@Override
	public void insert(UserExtInfo record) {

		this.userExtInfoDao.insert(record);

	}

	@Override
	public int deleteByPrimaryKey(String uuid) {
		
		return this.userExtInfoDao.deleteByPrimaryKey(uuid);
	}

	@Override
	public int insertSelective(UserExtInfo record) {
		
		return this.userExtInfoDao.insertSelective(record);
	}

	@Override
	public UserExtInfo selectByPrimaryKey(String uuid) {
		
		return this.userExtInfoDao.selectByPrimaryKey(uuid);
	}

	@Override
	public int updateByPrimaryKeySelective(UserExtInfo record) {
		
		return this.userExtInfoDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(UserExtInfo record) {
		
		return this.userExtInfoDao.updateByPrimaryKey(record);
	}

}
