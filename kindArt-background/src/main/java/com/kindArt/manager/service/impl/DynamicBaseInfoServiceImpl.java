package com.kindArt.manager.service.impl;

import java.util.Map;

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

	@Override
	public int deleteByPrimaryKey(String uuid) {

		return this.dynamicBaseInfoDao.deleteByPrimaryKey(uuid);
	}

	@Override
	public int insertSelective(DynamicBaseInfo record) {

		return this.dynamicBaseInfoDao.insertSelective(record);
	}

	@Override
	public DynamicBaseInfo selectByPrimaryKey(String uuid) {

		return this.dynamicBaseInfoDao.selectByPrimaryKey(uuid);
	}

	@Override
	public int updateByPrimaryKeySelective(DynamicBaseInfo record) {

		return this.dynamicBaseInfoDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(DynamicBaseInfo record) {

		return this.dynamicBaseInfoDao.updateByPrimaryKey(record);
	}

	@Override
	public Map[] selectList(String userid) {

		return this.dynamicBaseInfoDao.selectList(userid);
	}

}
