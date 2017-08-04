package com.kindArt.manager.dao;

import com.kindArt.manager.domain.TagDynamicRelation;

public interface TagDynamicRelationMapper {
    int deleteByPrimaryKey(String uuid);

    int insert(TagDynamicRelation record);

    int insertSelective(TagDynamicRelation record);

    TagDynamicRelation selectByPrimaryKey(String uuid);

    int updateByPrimaryKeySelective(TagDynamicRelation record);

    int updateByPrimaryKey(TagDynamicRelation record);
}