package com.kindArt.manager.service;

import com.kindArt.manager.domain.FindBaseExt;

public interface IFindBaseExtService {
	
	public void insert(FindBaseExt record);  
	
	public int deleteByPrimaryKey(String uuid);

	public int insertSelective(FindBaseExt record);

	public FindBaseExt selectByPrimaryKey(String uuid);

	public int updateByPrimaryKeySelective(FindBaseExt record);

	public int updateByPrimaryKey(FindBaseExt record);
	
}
