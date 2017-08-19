package com.kindArt.manager.service;

import com.kindArt.manager.domain.BusAttInfo;

public interface IBusAttInfoService {
	
	public void insert(BusAttInfo record);  
	
	public int deleteByPrimaryKey(String uuid);

	public int insertSelective(BusAttInfo record);

	public BusAttInfo selectByPrimaryKey(String uuid);

	public int updateByPrimaryKeySelective(BusAttInfo record);

	public int updateByPrimaryKey(BusAttInfo record);
	
}
