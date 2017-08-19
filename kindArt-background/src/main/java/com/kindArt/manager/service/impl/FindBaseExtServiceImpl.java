package com.kindArt.manager.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kindArt.manager.dao.FindBaseExtMapper;
import com.kindArt.manager.domain.FindBaseExt;
import com.kindArt.manager.service.IFindBaseExtService;

@Service("FindBaseExtService") 
public class FindBaseExtServiceImpl implements IFindBaseExtService {

	@Resource  
    private FindBaseExtMapper findBaseExtDao;  

	@Override
	public void insert(FindBaseExt record) {

		this.findBaseExtDao.insert(record);

	}

	@Override
	public int deleteByPrimaryKey(String uuid) {
		
		return this.findBaseExtDao.deleteByPrimaryKey(uuid);
	}

	@Override
	public int insertSelective(FindBaseExt record) {
		
		return this.findBaseExtDao.insertSelective(record);
	}

	@Override
	public FindBaseExt selectByPrimaryKey(String uuid) {
		
		return this.findBaseExtDao.selectByPrimaryKey(uuid);
	}

	@Override
	public int updateByPrimaryKeySelective(FindBaseExt record) {
		
		return this.findBaseExtDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(FindBaseExt record) {
		
		return this.findBaseExtDao.updateByPrimaryKey(record);
	}

}
