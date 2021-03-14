package com.mypage.service;

import java.util.List;

import com.mypage.common.dto.MemberDTO;

public interface HomeService {
	
	public List<MemberDTO> getMember(MemberDTO memberDTO);
	
}
