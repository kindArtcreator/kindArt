package com.kindArt.manager.dao;

import com.kindArt.manager.domain.BusAttInfo;

public interface BusAttInfoMapper {
    int deleteByPrimaryKey(String uuid);

    int insert(BusAttInfo record);

    int insertSelective(BusAttInfo record);

    BusAttInfo selectByPrimaryKey(String uuid);

    int updateByPrimaryKeySelective(BusAttInfo record);

    int updateByPrimaryKey(BusAttInfo record);
}