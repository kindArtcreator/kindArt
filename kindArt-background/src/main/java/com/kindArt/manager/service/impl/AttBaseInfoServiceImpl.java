package com.kindArt.manager.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kindArt.manager.dao.AttBaseInfoMapper;
import com.kindArt.manager.domain.AttBaseInfo;
import com.kindArt.manager.service.IAttBaseInfoService;

@Service("AttBaseInfoService") 
public class AttBaseInfoServiceImpl implements IAttBaseInfoService {

	@Resource  
    private AttBaseInfoMapper attBaseInfoDao;  

	@Override
	public void insert(AttBaseInfo record) {

		this.attBaseInfoDao.insert(record);

	}

	@Override
	public int deleteByPrimaryKey(String uuid) {
		
		return this.attBaseInfoDao.deleteByPrimaryKey(uuid);
	}

	@Override
	public int insertSelective(AttBaseInfo record) {
		
		return this.attBaseInfoDao.insertSelective(record);
	}

	@Override
	public AttBaseInfo selectByPrimaryKey(String uuid) {
		
		return this.attBaseInfoDao.selectByPrimaryKey(uuid);
	}

	@Override
	public int updateByPrimaryKeySelective(AttBaseInfo record) {
		
		return this.attBaseInfoDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(AttBaseInfo record) {
		
		return this.attBaseInfoDao.updateByPrimaryKey(record);
	}

}
