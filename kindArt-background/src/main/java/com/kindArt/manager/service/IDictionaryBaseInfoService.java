package com.kindArt.manager.service;

import com.kindArt.manager.domain.DictionaryBaseInfo;

public interface IDictionaryBaseInfoService {
	
	public void insert(DictionaryBaseInfo record);  
	
	public int deleteByPrimaryKey(String uuid);

	public int insertSelective(DictionaryBaseInfo record);

	public DictionaryBaseInfo selectByPrimaryKey(String uuid);

	public int updateByPrimaryKeySelective(DictionaryBaseInfo record);

	public int updateByPrimaryKey(DictionaryBaseInfo record);
	
}
