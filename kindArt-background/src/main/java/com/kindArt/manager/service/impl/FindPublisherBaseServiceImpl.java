package com.kindArt.manager.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kindArt.manager.dao.FindPublisherBaseMapper;
import com.kindArt.manager.domain.FindPublisherBase;
import com.kindArt.manager.service.IFindPublisherBaseService;

@Service("FindPublisherBaseService") 
public class FindPublisherBaseServiceImpl implements IFindPublisherBaseService {

	@Resource  
    private FindPublisherBaseMapper findPublisherBaseDao;  

	@Override
	public void insert(FindPublisherBase record) {

		this.findPublisherBaseDao.insert(record);

	}

	@Override
	public int deleteByPrimaryKey(String uuid) {
		
		return this.findPublisherBaseDao.deleteByPrimaryKey(uuid);
	}

	@Override
	public int insertSelective(FindPublisherBase record) {
		
		return this.findPublisherBaseDao.insertSelective(record);
	}

	@Override
	public FindPublisherBase selectByPrimaryKey(String uuid) {
		
		return this.findPublisherBaseDao.selectByPrimaryKey(uuid);
	}

	@Override
	public int updateByPrimaryKeySelective(FindPublisherBase record) {
		
		return this.findPublisherBaseDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(FindPublisherBase record) {
		
		return this.findPublisherBaseDao.updateByPrimaryKey(record);
	}

}
