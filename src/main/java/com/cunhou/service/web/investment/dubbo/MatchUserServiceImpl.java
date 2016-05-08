package com.cunhou.service.web.investment.dubbo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cunhou.service.web.common.PageView;
import com.cunhou.service.web.exception.YuehouServiceException;
import com.cunhou.service.web.investment.entry.MatchUser;
import com.cunhou.service.web.investment.inface.MatchUserService;
import com.cunhou.service.web.investment.mapper.MatchUserMapper;

@Service
public class MatchUserServiceImpl implements MatchUserService {

	@Autowired
    private MatchUserMapper matchUserMapper;
	
	@Override
	public List<MatchUser> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(String id) throws YuehouServiceException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(MatchUser t) throws YuehouServiceException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public MatchUser findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int add(MatchUser t) throws YuehouServiceException {
		return matchUserMapper.insert(t);
	}

	@Override
	public PageView findPage(PageView pageView, MatchUser t) {
		// TODO Auto-generated method stub
		return null;
	}

}
