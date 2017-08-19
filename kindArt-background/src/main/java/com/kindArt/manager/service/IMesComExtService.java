package com.kindArt.manager.service;

import com.kindArt.manager.domain.MesComExt;

public interface IMesComExtService {
	
	public void insert(MesComExt record);  
	
	public int deleteByPrimaryKey(String uuid);

	public int insertSelective(MesComExt record);

	public MesComExt selectByPrimaryKey(String uuid);

	public int updateByPrimaryKeySelective(MesComExt record);

	public int updateByPrimaryKey(MesComExt record);
	
}
