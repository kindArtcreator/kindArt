package com.kindArt.manager.dao;

import com.kindArt.manager.domain.DynamicBaseInfo;

public interface DynamicBaseInfoMapper {
    int deleteByPrimaryKey(String uuid);

    int insert(DynamicBaseInfo record);

    int insertSelective(DynamicBaseInfo record);

    DynamicBaseInfo selectByPrimaryKey(String uuid);

    int updateByPrimaryKeySelective(DynamicBaseInfo record);

    int updateByPrimaryKey(DynamicBaseInfo record);
}