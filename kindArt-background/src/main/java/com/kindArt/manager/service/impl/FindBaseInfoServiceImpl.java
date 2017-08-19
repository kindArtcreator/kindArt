package com.kindArt.manager.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kindArt.manager.dao.FindBaseInfoMapper;
import com.kindArt.manager.domain.FindBaseInfo;
import com.kindArt.manager.service.IFindBaseInfoService;

@Service("FindBaseInfoService") 
public class FindBaseInfoServiceImpl implements IFindBaseInfoService {

	@Resource  
    private FindBaseInfoMapper findBaseInfoDao;  

	@Override
	public void insert(FindBaseInfo record) {

		this.findBaseInfoDao.insert(record);

	}

	@Override
	public int deleteByPrimaryKey(String uuid) {
		
		return this.findBaseInfoDao.deleteByPrimaryKey(uuid);
	}

	@Override
	public int insertSelective(FindBaseInfo record) {
		
		return this.findBaseInfoDao.insertSelective(record);
	}

	@Override
	public FindBaseInfo selectByPrimaryKey(String uuid) {
		
		return this.findBaseInfoDao.selectByPrimaryKey(uuid);
	}

	@Override
	public int updateByPrimaryKeySelective(FindBaseInfo record) {
		
		return this.findBaseInfoDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(FindBaseInfo record) {
		
		return this.findBaseInfoDao.updateByPrimaryKey(record);
	}

}
