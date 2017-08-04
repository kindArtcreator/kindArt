package com.kindArt.manager.dao;

import com.kindArt.manager.domain.OpinionFeedback;

public interface OpinionFeedbackMapper {
    int deleteByPrimaryKey(String uuid);

    int insert(OpinionFeedback record);

    int insertSelective(OpinionFeedback record);

    OpinionFeedback selectByPrimaryKey(String uuid);

    int updateByPrimaryKeySelective(OpinionFeedback record);

    int updateByPrimaryKey(OpinionFeedback record);
}