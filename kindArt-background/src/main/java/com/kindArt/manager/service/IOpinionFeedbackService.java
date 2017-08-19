package com.kindArt.manager.service;

import com.kindArt.manager.domain.OpinionFeedback;

public interface IOpinionFeedbackService {
	
	public void insert(OpinionFeedback record);  
	
	public int deleteByPrimaryKey(String uuid);

	public int insertSelective(OpinionFeedback record);

	public OpinionFeedback selectByPrimaryKey(String uuid);

	public int updateByPrimaryKeySelective(OpinionFeedback record);

	public int updateByPrimaryKey(OpinionFeedback record);
	
}
