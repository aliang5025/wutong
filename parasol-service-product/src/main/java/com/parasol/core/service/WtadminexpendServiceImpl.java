package com.parasol.core.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.parasol.core.dao.mall.Wt_admin_expendMapper;
import com.parasol.core.mall.Wt_admin_expend;

public class WtadminexpendServiceImpl implements WtadminexpendService {

	@Autowired
	private Wt_admin_expendMapper wtadminexpendMapper; 
	
	@Override
	public int deleteByPrimaryKey(Integer id) {
		int i = wtadminexpendMapper.deleteByPrimaryKey(id);
		return i;
	}

	@Override
	public int insert(Wt_admin_expend record) {
		int i = wtadminexpendMapper.insert(record);
		return i;
	}

	@Override
	public int insertSelective(Wt_admin_expend record) {
		int i = wtadminexpendMapper.insertSelective(record);
		return i;
	}

	@Override
	public Wt_admin_expend selectByPrimaryKey(Integer id) {
		Wt_admin_expend key = wtadminexpendMapper.selectByPrimaryKey(id);
		return key;
	}

	@Override
	public int updateByPrimaryKeySelective(Wt_admin_expend record) {
		int i = wtadminexpendMapper.updateByPrimaryKeySelective(record);
		return i;
	}

	@Override
	public int updateByPrimaryKey(Wt_admin_expend record) {
		int i = wtadminexpendMapper.updateByPrimaryKey(record);
		return i;
	}


}