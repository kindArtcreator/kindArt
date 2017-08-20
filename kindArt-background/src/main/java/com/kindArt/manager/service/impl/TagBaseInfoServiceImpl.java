package com.kindArt.manager.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kindArt.manager.dao.TagBaseInfoMapper;
import com.kindArt.manager.domain.TagBaseInfo;
import com.kindArt.manager.service.ITagBaseInfoService;

@Service("TagBaseInfoService") 
public class TagBaseInfoServiceImpl implements ITagBaseInfoService {

	@Resource  
    private TagBaseInfoMapper tagBaseInfoDao;  

	@Override
	public void insert(TagBaseInfo record) {

		this.tagBaseInfoDao.insert(record);

	}

	@Override
	public int deleteByPrimaryKey(String uuid) {
		
		return this.tagBaseInfoDao.deleteByPrimaryKey(uuid);
	}

	@Override
	public int insertSelective(TagBaseInfo record) {
		
		return this.tagBaseInfoDao.insertSelective(record);
	}

	@Override
	public TagBaseInfo selectByPrimaryKey(String uuid) {
		
		return this.tagBaseInfoDao.selectByPrimaryKey(uuid);
	}

	@Override
	public int updateByPrimaryKeySelective(TagBaseInfo record) {
		
		return this.tagBaseInfoDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(TagBaseInfo record) {
		
		return this.tagBaseInfoDao.updateByPrimaryKey(record);
	}
	
	@Override
	public List<TagBaseInfo> selectList() {
		
		return this.tagBaseInfoDao.selectList();
	}


}
