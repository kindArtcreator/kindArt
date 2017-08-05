package com.kindArt.manager.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kindArt.manager.dao.DynamicBaseInfoMapper;
import com.kindArt.manager.domain.DynamicBaseInfo;
import com.kindArt.manager.service.IDynamicBaseInfoService;

@Service("dynamicBaseInfoService") 
public class DynamicBaseInfoServiceImpl implements IDynamicBaseInfoService {

	@Resource  
    private DynamicBaseInfoMapper dynamicBaseInfoDao;  

	@Override
	public void insert(DynamicBaseInfo dbi) {

		this.dynamicBaseInfoDao.insert(dbi);

	}

}
