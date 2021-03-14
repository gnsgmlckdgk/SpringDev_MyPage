package com.mypage.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.mypage.common.dto.MemberDTO;
import com.mypage.dao.HomeDAO;
import com.mypage.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService {

	@Inject
	HomeDAO mdao;
	
	@Override
	public List<MemberDTO> getMember(MemberDTO mDTO) {
		
		List<MemberDTO> resultList = mdao.getMember(mDTO);
		
		for(int i=0; i<resultList.size(); i++) {
			
			MemberDTO memberDTO = resultList.get(i);
			System.out.println("MemberDAO["+i+"]");
			System.out.println(memberDTO.getSeq_no());
			System.out.println(memberDTO.getId());
			System.out.println(memberDTO.getPassword());
			System.out.println(memberDTO.getCreate_date());
			System.out.println(memberDTO.getCreate_user());
			System.out.println(memberDTO.getUpdate_date());
			System.out.println(memberDTO.getCreate_user());
			
		}
		
		return resultList;
	}

}
