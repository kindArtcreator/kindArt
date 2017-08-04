package com.kindArt.manager.dao;

import com.kindArt.manager.domain.DictionaryBaseInfo;

public interface DictionaryBaseInfoMapper {
    int deleteByPrimaryKey(String uuid);

    int insert(DictionaryBaseInfo record);

    int insertSelective(DictionaryBaseInfo record);

    DictionaryBaseInfo selectByPrimaryKey(String uuid);

    int updateByPrimaryKeySelective(DictionaryBaseInfo record);

    int updateByPrimaryKey(DictionaryBaseInfo record);
}