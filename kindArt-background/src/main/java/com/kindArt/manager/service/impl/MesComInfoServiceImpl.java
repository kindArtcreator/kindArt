package com.kindArt.manager.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kindArt.manager.dao.MesComInfoMapper;
import com.kindArt.manager.domain.MesComInfo;
import com.kindArt.manager.service.IMesComInfoService;

@Service("MesComInfoService") 
public class MesComInfoServiceImpl implements IMesComInfoService {

	@Resource  
    private MesComInfoMapper mesComInfoDao;  

	@Override
	public void insert(MesComInfo record) {

		this.mesComInfoDao.insert(record);

	}

	@Override
	public int deleteByPrimaryKey(String uuid) {
		
		return this.mesComInfoDao.deleteByPrimaryKey(uuid);
	}

	@Override
	public int insertSelective(MesComInfo record) {
		
		return this.mesComInfoDao.insertSelective(record);
	}

	@Override
	public MesComInfo selectByPrimaryKey(String uuid) {
		
		return this.mesComInfoDao.selectByPrimaryKey(uuid);
	}

	@Override
	public int updateByPrimaryKeySelective(MesComInfo record) {
		
		return this.mesComInfoDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(MesComInfo record) {
		
		return this.mesComInfoDao.updateByPrimaryKey(record);
	}

}
