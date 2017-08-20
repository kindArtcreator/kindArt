package com.kindArt.manager.dao;

import java.util.List;

import com.kindArt.manager.domain.TagBaseInfo;

public interface TagBaseInfoMapper {
    int deleteByPrimaryKey(String tagNo);

    int insert(TagBaseInfo record);

    int insertSelective(TagBaseInfo record);

    TagBaseInfo selectByPrimaryKey(String tagNo);

    int updateByPrimaryKeySelective(TagBaseInfo record);

    int updateByPrimaryKey(TagBaseInfo record);
    
    List<TagBaseInfo> selectList();
}