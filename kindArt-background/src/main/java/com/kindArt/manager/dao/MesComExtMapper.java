package com.kindArt.manager.dao;

import com.kindArt.manager.domain.MesComExt;

public interface MesComExtMapper {
    int deleteByPrimaryKey(String uuid);

    int insert(MesComExt record);

    int insertSelective(MesComExt record);

    MesComExt selectByPrimaryKey(String uuid);

    int updateByPrimaryKeySelective(MesComExt record);

    int updateByPrimaryKey(MesComExt record);
}