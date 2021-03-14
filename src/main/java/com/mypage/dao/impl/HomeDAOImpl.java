package com.mypage.dao.impl;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.mypage.common.dto.MemberDTO;
import com.mypage.dao.HomeDAO;

@Repository
public class HomeDAOImpl implements HomeDAO {

	@Inject
	SqlSession sqlSession;
	
	private static final String namespace = "home.test";
	
	
	@Override
	public List<MemberDTO> getMember(MemberDTO mDTO) {
		List<MemberDTO> resultList = sqlSession.selectList(namespace+".getmember", mDTO);
		return resultList;
	}

}
