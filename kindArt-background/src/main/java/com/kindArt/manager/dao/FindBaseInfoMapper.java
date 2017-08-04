package com.kindArt.manager.dao;

import com.kindArt.manager.domain.FindBaseInfo;

public interface FindBaseInfoMapper {
    int deleteByPrimaryKey(String uuid);

    int insert(FindBaseInfo record);

    int insertSelective(FindBaseInfo record);

    FindBaseInfo selectByPrimaryKey(String uuid);

    int updateByPrimaryKeySelective(FindBaseInfo record);

    int updateByPrimaryKeyWithBLOBs(FindBaseInfo record);

    int updateByPrimaryKey(FindBaseInfo record);
}