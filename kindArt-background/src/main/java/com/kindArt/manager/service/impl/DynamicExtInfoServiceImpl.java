package com.kindArt.manager.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kindArt.manager.dao.DynamicExtInfoMapper;
import com.kindArt.manager.domain.DynamicExtInfo;
import com.kindArt.manager.service.IDynamicExtInfoService;

@Service("DynamicExtInfoService") 
public class DynamicExtInfoServiceImpl implements IDynamicExtInfoService {

	@Resource  
    private DynamicExtInfoMapper dynamicExtInfoDao;  

	@Override
	public void insert(DynamicExtInfo record) {

		this.dynamicExtInfoDao.insert(record);

	}

	@Override
	public int deleteByPrimaryKey(String uuid) {
		
		return this.dynamicExtInfoDao.deleteByPrimaryKey(uuid);
	}

	@Override
	public int insertSelective(DynamicExtInfo record) {
		
		return this.dynamicExtInfoDao.insertSelective(record);
	}

	@Override
	public DynamicExtInfo selectByPrimaryKey(String uuid) {
		
		return this.dynamicExtInfoDao.selectByPrimaryKey(uuid);
	}

	@Override
	public int updateByPrimaryKeySelective(DynamicExtInfo record) {
		
		return this.dynamicExtInfoDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(DynamicExtInfo record) {
		
		return this.dynamicExtInfoDao.updateByPrimaryKey(record);
	}

}
