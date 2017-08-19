package com.kindArt.manager.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kindArt.manager.dao.OpinionFeedbackMapper;
import com.kindArt.manager.domain.OpinionFeedback;
import com.kindArt.manager.service.IOpinionFeedbackService;

@Service("OpinionFeedbackService") 
public class OpinionFeedbackServiceImpl implements IOpinionFeedbackService {

	@Resource  
    private OpinionFeedbackMapper opinionFeedbackDao;  

	@Override
	public void insert(OpinionFeedback record) {

		this.opinionFeedbackDao.insert(record);

	}

	@Override
	public int deleteByPrimaryKey(String uuid) {
		
		return this.opinionFeedbackDao.deleteByPrimaryKey(uuid);
	}

	@Override
	public int insertSelective(OpinionFeedback record) {
		
		return this.opinionFeedbackDao.insertSelective(record);
	}

	@Override
	public OpinionFeedback selectByPrimaryKey(String uuid) {
		
		return this.opinionFeedbackDao.selectByPrimaryKey(uuid);
	}

	@Override
	public int updateByPrimaryKeySelective(OpinionFeedback record) {
		
		return this.opinionFeedbackDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(OpinionFeedback record) {
		
		return this.opinionFeedbackDao.updateByPrimaryKey(record);
	}

}
