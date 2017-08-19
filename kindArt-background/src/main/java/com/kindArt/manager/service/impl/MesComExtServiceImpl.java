package com.kindArt.manager.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kindArt.manager.dao.MesComExtMapper;
import com.kindArt.manager.domain.MesComExt;
import com.kindArt.manager.service.IMesComExtService;

@Service("MesComExtService") 
public class MesComExtServiceImpl implements IMesComExtService {

	@Resource  
    private MesComExtMapper mesComExtDao;  

	@Override
	public void insert(MesComExt record) {

		this.mesComExtDao.insert(record);

	}

	@Override
	public int deleteByPrimaryKey(String uuid) {
		
		return this.mesComExtDao.deleteByPrimaryKey(uuid);
	}

	@Override
	public int insertSelective(MesComExt record) {
		
		return this.mesComExtDao.insertSelective(record);
	}

	@Override
	public MesComExt selectByPrimaryKey(String uuid) {
		
		return this.mesComExtDao.selectByPrimaryKey(uuid);
	}

	@Override
	public int updateByPrimaryKeySelective(MesComExt record) {
		
		return this.mesComExtDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(MesComExt record) {
		
		return this.mesComExtDao.updateByPrimaryKey(record);
	}

}
