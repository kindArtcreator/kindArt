package com.kindArt.manager.dao;

import com.kindArt.manager.domain.FindPublisherBase;

public interface FindPublisherBaseMapper {
    int deleteByPrimaryKey(String uuid);

    int insert(FindPublisherBase record);

    int insertSelective(FindPublisherBase record);

    FindPublisherBase selectByPrimaryKey(String uuid);

    int updateByPrimaryKeySelective(FindPublisherBase record);

    int updateByPrimaryKey(FindPublisherBase record);
}