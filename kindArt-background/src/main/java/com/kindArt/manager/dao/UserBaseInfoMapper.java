package com.kindArt.manager.dao;

import com.kindArt.manager.domain.UserBaseInfo;

public interface UserBaseInfoMapper {
    int deleteByPrimaryKey(String userNo);

    int insert(UserBaseInfo record);

    int insertSelective(UserBaseInfo record);

    UserBaseInfo selectByPrimaryKey(String userNo);

    int updateByPrimaryKeySelective(UserBaseInfo record);

    int updateByPrimaryKey(UserBaseInfo record);
}