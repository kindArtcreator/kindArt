package com.kindArt.manager.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kindArt.manager.dao.BusAttInfoMapper;
import com.kindArt.manager.domain.BusAttInfo;
import com.kindArt.manager.service.IBusAttInfoService;

@Service("BusAttInfoService") 
public class BusAttInfoServiceImpl implements IBusAttInfoService {

	@Resource  
    private BusAttInfoMapper busAttInfoDao;  

	@Override
	public void insert(BusAttInfo record) {

		this.busAttInfoDao.insert(record);

	}

	@Override
	public int deleteByPrimaryKey(String uuid) {
		
		return this.busAttInfoDao.deleteByPrimaryKey(uuid);
	}

	@Override
	public int insertSelective(BusAttInfo record) {
		
		return this.busAttInfoDao.insertSelective(record);
	}

	@Override
	public BusAttInfo selectByPrimaryKey(String uuid) {
		
		return this.busAttInfoDao.selectByPrimaryKey(uuid);
	}

	@Override
	public int updateByPrimaryKeySelective(BusAttInfo record) {
		
		return this.busAttInfoDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(BusAttInfo record) {
		
		return this.busAttInfoDao.updateByPrimaryKey(record);
	}

}
