package com.kindArt.manager.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kindArt.manager.dao.TagDynamicRelationMapper;
import com.kindArt.manager.domain.TagDynamicRelation;
import com.kindArt.manager.service.ITagDynamicRelationService;

@Service("TagDynamicRelationService") 
public class TagDynamicRelationServiceImpl implements ITagDynamicRelationService {

	@Resource  
    private TagDynamicRelationMapper tagDynamicRelationDao;  

	@Override
	public void insert(TagDynamicRelation record) {

		this.tagDynamicRelationDao.insert(record);

	}

	@Override
	public int deleteByPrimaryKey(String uuid) {
		
		return this.tagDynamicRelationDao.deleteByPrimaryKey(uuid);
	}

	@Override
	public int insertSelective(TagDynamicRelation record) {
		
		return this.tagDynamicRelationDao.insertSelective(record);
	}

	@Override
	public TagDynamicRelation selectByPrimaryKey(String uuid) {
		
		return this.tagDynamicRelationDao.selectByPrimaryKey(uuid);
	}

	@Override
	public int updateByPrimaryKeySelective(TagDynamicRelation record) {
		
		return this.tagDynamicRelationDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(TagDynamicRelation record) {
		
		return this.tagDynamicRelationDao.updateByPrimaryKey(record);
	}

}
