package com.kindArt.manager.service;

import com.kindArt.manager.domain.MesComInfo;

public interface IMesComInfoService {
	
	public void insert(MesComInfo record);  
	
	public int deleteByPrimaryKey(String uuid);

	public int insertSelective(MesComInfo record);

	public MesComInfo selectByPrimaryKey(String uuid);

	public int updateByPrimaryKeySelective(MesComInfo record);

	public int updateByPrimaryKey(MesComInfo record);
	
}
