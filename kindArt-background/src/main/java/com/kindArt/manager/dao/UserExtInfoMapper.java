package com.kindArt.manager.dao;

import com.kindArt.manager.domain.UserExtInfo;

public interface UserExtInfoMapper {
    int deleteByPrimaryKey(String uuid);

    int insert(UserExtInfo record);

    int insertSelective(UserExtInfo record);

    UserExtInfo selectByPrimaryKey(String uuid);

    int updateByPrimaryKeySelective(UserExtInfo record);

    int updateByPrimaryKey(UserExtInfo record);
}