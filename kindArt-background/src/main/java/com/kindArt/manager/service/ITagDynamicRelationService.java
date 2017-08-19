package com.kindArt.manager.service;

import com.kindArt.manager.domain.TagDynamicRelation;

public interface ITagDynamicRelationService {
	
	public void insert(TagDynamicRelation record);  
	
	public int deleteByPrimaryKey(String uuid);

	public int insertSelective(TagDynamicRelation record);

	public TagDynamicRelation selectByPrimaryKey(String uuid);

	public int updateByPrimaryKeySelective(TagDynamicRelation record);

	public int updateByPrimaryKey(TagDynamicRelation record);
	
}
