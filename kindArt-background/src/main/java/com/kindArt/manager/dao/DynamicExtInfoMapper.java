package com.kindArt.manager.dao;

import com.kindArt.manager.domain.DynamicExtInfo;

public interface DynamicExtInfoMapper {
    int deleteByPrimaryKey(String uuid);

    int insert(DynamicExtInfo record);

    int insertSelective(DynamicExtInfo record);

    DynamicExtInfo selectByPrimaryKey(String uuid);

    int updateByPrimaryKeySelective(DynamicExtInfo record);

    int updateByPrimaryKey(DynamicExtInfo record);
}