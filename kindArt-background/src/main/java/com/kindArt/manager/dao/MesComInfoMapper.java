package com.kindArt.manager.dao;

import com.kindArt.manager.domain.MesComInfo;

public interface MesComInfoMapper {
    int deleteByPrimaryKey(String uuid);

    int insert(MesComInfo record);

    int insertSelective(MesComInfo record);

    MesComInfo selectByPrimaryKey(String uuid);

    int updateByPrimaryKeySelective(MesComInfo record);

    int updateByPrimaryKey(MesComInfo record);
}