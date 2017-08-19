package com.kindArt.manager.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kindArt.manager.dao.DictionaryBaseInfoMapper;
import com.kindArt.manager.domain.DictionaryBaseInfo;
import com.kindArt.manager.service.IDictionaryBaseInfoService;

@Service("DictionaryBaseInfoService") 
public class DictionaryBaseInfoServiceImpl implements IDictionaryBaseInfoService {

	@Resource  
    private DictionaryBaseInfoMapper dictionaryBaseInfoDao;  

	@Override
	public void insert(DictionaryBaseInfo record) {

		this.dictionaryBaseInfoDao.insert(record);

	}

	@Override
	public int deleteByPrimaryKey(String uuid) {
		
		return this.dictionaryBaseInfoDao.deleteByPrimaryKey(uuid);
	}

	@Override
	public int insertSelective(DictionaryBaseInfo record) {
		
		return this.dictionaryBaseInfoDao.insertSelective(record);
	}

	@Override
	public DictionaryBaseInfo selectByPrimaryKey(String uuid) {
		
		return this.dictionaryBaseInfoDao.selectByPrimaryKey(uuid);
	}

	@Override
	public int updateByPrimaryKeySelective(DictionaryBaseInfo record) {
		
		return this.dictionaryBaseInfoDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(DictionaryBaseInfo record) {
		
		return this.dictionaryBaseInfoDao.updateByPrimaryKey(record);
	}

}
