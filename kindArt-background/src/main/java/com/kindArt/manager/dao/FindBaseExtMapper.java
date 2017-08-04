package com.kindArt.manager.dao;

import com.kindArt.manager.domain.FindBaseExt;

public interface FindBaseExtMapper {
    int deleteByPrimaryKey(String uuid);

    int insert(FindBaseExt record);

    int insertSelective(FindBaseExt record);

    FindBaseExt selectByPrimaryKey(String uuid);

    int updateByPrimaryKeySelective(FindBaseExt record);

    int updateByPrimaryKey(FindBaseExt record);
}