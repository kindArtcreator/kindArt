package com.kindArt.manager.dao;

import com.kindArt.manager.domain.AttBaseInfo;

public interface AttBaseInfoMapper {
    int deleteByPrimaryKey(String uuid);

    int insert(AttBaseInfo record);

    int insertSelective(AttBaseInfo record);

    AttBaseInfo selectByPrimaryKey(String uuid);

    int updateByPrimaryKeySelective(AttBaseInfo record);

    int updateByPrimaryKey(AttBaseInfo record);
}